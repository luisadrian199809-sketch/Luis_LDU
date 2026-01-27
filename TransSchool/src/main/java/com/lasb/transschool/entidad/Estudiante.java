package com.lasb.transschool.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String direccion;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "ruta_id", nullable = true)
    private Ruta ruta;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "representante_id", nullable = true)
    private Representante representante;

    public Estudiante() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public Ruta getRuta() { return ruta; }
    public void setRuta(Ruta ruta) { this.ruta = ruta; }

    public Representante getRepresentante() { return representante; }
    public void setRepresentante(Representante representante) { this.representante = representante; }
}
