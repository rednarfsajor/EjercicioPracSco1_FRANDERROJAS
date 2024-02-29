/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.dao;

import com.EjercicioPractico1.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroDao extends JpaRepository <Libro,Long>{
    
}

