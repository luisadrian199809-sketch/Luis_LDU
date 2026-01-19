package com.denm.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.denm.matriculas.modelo.entidad.Matricula;
import com.denm.matriculas.repositorio.IMatriculaRepositorio;
import com.denm.matriculas.servicio.IMatriculasServicio;

@Service
@Component
public class MatriculaServicioimpl implements IMatriculasServicio{
	@Autowired
	public IMatriculaRepositorio repositorioMatricula;

	@Override
	public Matricula insertarMatricula(Matricula nuevoMatricula) {
		// TODO Auto-generated method stub
		return repositorioMatricula.save(nuevoMatricula);
	}

	@Override
	public Matricula editarMatricula(int idMatricula) {
		// TODO Auto-generated method stub
		return repositorioMatricula.findById(idMatricula).get();
	}

	@Override
	public void eliminarMatricula(int idMatricula) {
		// TODO Auto-generated method stub
		repositorioMatricula.delete(editarMatricula(idMatricula));
	}

	@Override
	public List<Matricula> listarMatricula() {
		// TODO Auto-generated method stub
		return repositorioMatricula.findAll();
	}

}
