package co.edu.ufps.ingsistemas.informesgestionproyectos.dto;

import java.util.Date;

public class FormatoInformeDTO {

	private Integer id;
	private Integer anio;
	private Integer semestre;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;

	public FormatoInformeDTO(Integer id, Integer anio, Integer semestre, String nombre, Date fechaInicio,
			Date fechaFin) {
		this.id = id;
		this.anio = anio;
		this.semestre = semestre;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public FormatoInformeDTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
}
