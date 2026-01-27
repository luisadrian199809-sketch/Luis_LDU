/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: QFX7A016
 * Date: 2026-01-27 00:58:45
 */


package com.lasb.transschool.controlador;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.lasb.transschool.entidad.Estudiante;
import com.lasb.transschool.servicio.EstudianteService;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {
    private final EstudianteService service;
    public EstudianteController(EstudianteService service){this.service=service;}

    @GetMapping
    public List<Estudiante> listar(){return service.listar();}

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante e){return service.guardar(e);}
}
