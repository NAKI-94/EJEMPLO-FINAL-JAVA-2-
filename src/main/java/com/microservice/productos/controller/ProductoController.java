package com.microservice.productos.controller;

import com.microservice.productos.entity.Producto;

import com.microservice.productos.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
@RequiredArgsConstructor
public class ProductoController {

    private final IProductoService productoService;


    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.getAllProducto();
    }

    @GetMapping("/{id}")
    public Optional<Producto> obtenerProducto(@PathVariable Long id) {
        return productoService.getProducto(id);
        //   .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id))
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }
}
