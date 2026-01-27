/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: OMBMZGMM
 * Date: 2026-01-27 00:58:45
 */


package com.lasb.transschool.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lasb.transschool.entidad.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {}
