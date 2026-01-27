package com.lasb.transschool.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lasb.transschool.entidad.Estudiante;
import com.lasb.transschool.entidad.Representante;
import com.lasb.transschool.entidad.Ruta;
import com.lasb.transschool.repositorio.EstudianteRepository;
import com.lasb.transschool.repositorio.RepresentanteRepository;
import com.lasb.transschool.repositorio.RutaRepository;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepo;
    private final RepresentanteRepository representanteRepo;
    private final RutaRepository rutaRepo;

    public EstudianteService(EstudianteRepository estudianteRepo,
                             RepresentanteRepository representanteRepo,
                             RutaRepository rutaRepo) {
        this.estudianteRepo = estudianteRepo;
        this.representanteRepo = representanteRepo;
        this.rutaRepo = rutaRepo;
    }

    public List<Estudiante> listar() {
        return estudianteRepo.findAll();
    }

    public Estudiante guardar(Estudiante e) {

        // Validar y cargar representante real desde la BD
        if (e.getRepresentante() != null && e.getRepresentante().getId() != null) {
            Representante rep = representanteRepo.findById(
                    e.getRepresentante().getId()
            ).orElseThrow(() -> new RuntimeException("El representante no existe"));
            e.setRepresentante(rep);
        }

        // Validar y cargar ruta real desde la BD
        if (e.getRuta() != null && e.getRuta().getId() != null) {
            Ruta ruta = rutaRepo.findById(
                    e.getRuta().getId()
            ).orElseThrow(() -> new RuntimeException("La ruta no existe"));
            e.setRuta(ruta);
        }

        return estudianteRepo.save(e);
    }
}
