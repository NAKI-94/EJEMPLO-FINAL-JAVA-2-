package com.microservice.productos.repository;

import com.microservice.productos.entity.Categoria;
import com.microservice.productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends JpaRepository <Categoria,Long> {
}
