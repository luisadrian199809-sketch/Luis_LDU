/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: K38YDI01
 * Date: 2026-01-27 00:58:45
 */

package com.lasb.transschool.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "representantes")
public class Representante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String telefono;

    public Representante() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
