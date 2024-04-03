
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.domain.Libro;
import com.EjercicioPractico1.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping("/libro")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var libros = libroService.getLibros();
        model.addAttribute("libros", libros);
        model.addAttribute("totalLibros", libros.size());
        return "libro/listado";
    }
    
    @GetMapping("/nuevo")
    public String libroNuevo(Libro libro) {
        return "/libro/modifica";
    }
    @PostMapping("/guardar")
    public String libroGuardar(Libro libro) {        
        
        libroService.save(libro);
        return "redirect:/libro/listado";
    }
    
    
     @GetMapping("/eliminar/{id}")
    public String libroEliminar(Libro libro) {
        libroService.delete(libro);
        return "redirect:/libro/listado";
    }

    @GetMapping("/modifica/{id}")
    public String categoriaModificar(Libro libro, Model model) {
        libro = libroService.getLibro(libro);
        model.addAttribute("book", libro);
        return "/libro/modifica";
    }  
    
    @PostMapping("/query1")
    public String consultaPorTitulo(@RequestParam (value="titulo")String titulo, Model model){
        var libros = libroService.findByTituloContaining(titulo);
        model.addAttribute("libros", libros);
        model.addAttribute("titulo", titulo);
        return "libro/listado";
    }
}
