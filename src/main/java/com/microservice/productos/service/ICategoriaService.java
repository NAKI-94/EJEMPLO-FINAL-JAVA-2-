package com.microservice.productos.service;

import com.microservice.productos.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {
    public Optional<Categoria> getCategoria (Long id);
    public List<Categoria> getAllCategoria ();
    public Categoria saveCategoria (Categoria categoria);
}
