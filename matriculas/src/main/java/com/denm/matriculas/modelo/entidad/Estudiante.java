package com.denm.matriculas.modelo.entidad;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Estudiante implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstudiante;
	
	private String nombreEstudiante;
	private String apellidoEstudiante;
	private String emailEstudiante;
	private String direccionEstudiante;
	private String estadoEstudiante; //A ACTIVO I INACTIVO
	
}
