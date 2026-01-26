package com.denm.matriculas.servicio;

import java.util.List;

import com.denm.matriculas.modelo.entidad.Matricula;

public interface IMatriculaServicio {
	
	public Matricula insertarMatricula(Matricula nuevaMatricula);
	public Matricula editarMatricula(int idMatricula);
	public void eliminarMatricula(int idMatricula);
	public List<Matricula> listarMatricula();

}
