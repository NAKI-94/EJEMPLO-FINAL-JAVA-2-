package com.microservice.productos.repository;

import com.microservice.productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends JpaRepository <Producto, Long> {
}
