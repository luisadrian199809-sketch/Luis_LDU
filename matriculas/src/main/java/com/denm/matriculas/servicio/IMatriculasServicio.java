package com.denm.matriculas.servicio;

import java.util.List;

import com.denm.matriculas.modelo.entidad.Matricula;

public interface IMatriculasServicio {
	public Matricula insertarMatricula(Matricula nuevoMatricula);
	public Matricula editarMatricula(int idMatricula);
	public void eliminarMatricula(int idMatricula);
	public List<Matricula> listarMatricula();

}
