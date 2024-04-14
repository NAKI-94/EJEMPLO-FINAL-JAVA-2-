package com.microservice.productos.service;

import com.microservice.productos.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public Optional<Producto> getProducto (Long id);
    public List<Producto> getAllProducto ();
    public Producto saveProducto (Producto producto);
}
