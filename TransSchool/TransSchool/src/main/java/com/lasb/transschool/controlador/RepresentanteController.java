/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: BQV59JOQ
 * Date: 2026-01-27 00:58:45
 */

package com.lasb.transschool.controlador;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.lasb.transschool.entidad.Representante;
import com.lasb.transschool.servicio.RepresentanteService;

@RestController
@RequestMapping("/api/representantes")
public class RepresentanteController {

    private final RepresentanteService service;

    public RepresentanteController(RepresentanteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Representante> listar() {
        return service.listar();
    }

    @PostMapping
    public Representante crear(@RequestBody Representante r) {
        return service.guardar(r);
    }
}
