package com.microservice.productos.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="producto")
@Getter
@Setter
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="categoria_id")
    private Categoria categoria;
}
