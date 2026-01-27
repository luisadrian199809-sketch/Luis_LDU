/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: QZZYD9YD
 * Date: 2026-01-27 00:58:45
 */


package com.lasb.transschool.servicio;

import java.util.List;
import org.springframework.stereotype.Service;

import com.lasb.transschool.entidad.Estudiante;
import com.lasb.transschool.repositorio.EstudianteRepository;

@Service
public class EstudianteService {
    private final EstudianteRepository repo;
    public EstudianteService(EstudianteRepository repo){this.repo=repo;}
    public List<Estudiante> listar(){return repo.findAll();}
    public Estudiante guardar(Estudiante e){return repo.save(e);}
}
