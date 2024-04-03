/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;
import com.EjercicioPractico1.domain.Libro;
import java.util.List;
public interface LibroService {
    public List<Libro> getLibros();
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Libro getLibro(Libro libro);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Libro libro);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Libro libro);
    
    public List<Libro> findByTituloContaining(String titulo);
}
