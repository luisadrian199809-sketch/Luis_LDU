/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: 3SYZW1D0
 * Date: 2026-01-27 00:58:45
 */


package com.lasb.transschool.controlador;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.lasb.transschool.entidad.Ruta;
import com.lasb.transschool.servicio.RutaService;

@RestController
@RequestMapping("/api/rutas")
public class RutaController {
    private final RutaService service;
    public RutaController(RutaService service){this.service=service;}

    @GetMapping
    public List<Ruta> listar(){return service.listar();}

    @PostMapping
    public Ruta crear(@RequestBody Ruta r){return service.guardar(r);}
}
