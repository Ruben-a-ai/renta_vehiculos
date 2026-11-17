package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricula;
    private String tipo;
    private String categoria;
    private Double precio;
    private Integer stock;

    // ===================
    // Constructores
    // ===================
    public Vehiculo() {
    }

    public Vehiculo(String matricula, String tipo, String categoria, Double precio, Integer stock) {
        this(null, matricula, tipo, categoria, precio, stock);
    }

    public Vehiculo(Long id, String matricula, String tipo, String categoria, Double precio, Integer stock) {
        this.id = id;
        this.matricula = matricula;
        this.tipo = tipo;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    // ===================
    // Getters y setters
    // ===================
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Vehiculo [id=" + id + ", matricula=" + matricula + ", tipo=" + tipo + ", stock=" + stock + "]";
    }
}
