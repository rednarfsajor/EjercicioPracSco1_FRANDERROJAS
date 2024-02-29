
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/libro")
public class LibroController_1 {
    @Autowired
    private LibroService libroService;

    @GetMapping("/Contacto")
    public String inicio(Model model) {
        var libros = libroService.getLibros();
        model.addAttribute("libros", libros);
        model.addAttribute("totalLibros", libros.size());
        return "libro/Contacto";
    }
}
