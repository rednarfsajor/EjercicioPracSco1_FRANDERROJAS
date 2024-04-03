/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.LibroDao;
import com.EjercicioPractico1.domain.Libro;
import com.EjercicioPractico1.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class LibroServiceImpl implements LibroService{
    @Autowired
    private LibroDao libroDao;

    @Override
    @Transactional(readOnly=true)
    public List<Libro> getLibros() {
        var lista=libroDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Libro getLibro(Libro libro) {
        return libroDao.findById(libro.getId()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Libro libro) {
        libroDao.save(libro);
    }
    
     @Override
    @Transactional
    public void delete(Libro libro) {
        libroDao.delete(libro);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Libro> findByTituloContaining(String titulo){
        return libroDao.findByTituloContaining(titulo);
    }
}
