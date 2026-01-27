/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: Z2ODK1XJ
 * Date: 2026-01-27 00:58:45
 */

package com.lasb.transschool.servicio;

import java.util.List;
import org.springframework.stereotype.Service;
import com.lasb.transschool.entidad.Representante;
import com.lasb.transschool.repositorio.RepresentanteRepository;

@Service
public class RepresentanteService {

    private final RepresentanteRepository repo;

    public RepresentanteService(RepresentanteRepository repo) {
        this.repo = repo;
    }

    public Representante guardar(Representante r) {
        return repo.save(r);
    }

    public List<Representante> listar() {
        return repo.findAll();
    }
}
