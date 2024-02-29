
package com.EjercicioPractico1.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
@Data
@Entity
@Table(name="libros")
public class Libro implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    
    private Long id;
    
    
    
    private String titulo;
    
    
    private String autor;
   
    
    private double precio;
    
    private String categoria;

    public Libro() {
    }

    public Libro(String titulo, String autor, double precio, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
    }

   
}
