/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: SG7GGOCC
 * Date: 2026-01-27 00:58:45
 */

package com.lasb.transschool.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lasb.transschool.entidad.Representante;

public interface RepresentanteRepository 
        extends JpaRepository<Representante, Long> {
}
