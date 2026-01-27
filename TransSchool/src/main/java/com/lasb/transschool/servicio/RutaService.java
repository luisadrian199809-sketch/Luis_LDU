/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: SUBAEORC
 * Date: 2026-01-27 00:58:45
 */


package com.lasb.transschool.servicio;

import java.util.List;
import org.springframework.stereotype.Service;

import com.lasb.transschool.entidad.Ruta;
import com.lasb.transschool.repositorio.RutaRepository;

@Service
public class RutaService {
    private final RutaRepository repo;
    public RutaService(RutaRepository repo){this.repo=repo;}
    public List<Ruta> listar(){return repo.findAll();}
    public Ruta guardar(Ruta r){return repo.save(r);}
}
