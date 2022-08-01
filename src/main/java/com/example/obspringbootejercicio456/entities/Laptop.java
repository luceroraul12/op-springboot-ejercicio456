package com.example.obspringbootejercicio456.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private LocalDate fecha;
    private Double precio;
    private Boolean stock;

    public Laptop() {
    }

    public Laptop(Long id, String nombre, LocalDate fecha, Double precio, Boolean stock) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public Boolean getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
