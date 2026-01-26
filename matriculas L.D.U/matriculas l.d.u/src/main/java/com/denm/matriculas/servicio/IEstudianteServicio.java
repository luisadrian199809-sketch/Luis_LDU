package com.denm.matriculas.servicio;

import java.util.List;

import com.denm.matriculas.modelo.entidad.Estudiante;

public interface IEstudianteServicio {
	
	public Estudiante insertarEstudiante(Estudiante nuevoEstudiante);
	public Estudiante editarEstudiante(int idEstudiante);
	public void eliminarEstudiante(int idEstudiante);
	public List<Estudiante> listarEstudiante();
	
}
