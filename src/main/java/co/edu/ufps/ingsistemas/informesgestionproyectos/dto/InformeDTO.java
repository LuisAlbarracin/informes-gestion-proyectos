package co.edu.ufps.ingsistemas.informesgestionproyectos.dto;

import java.util.Date;

public class InformeDTO {

	private Integer id;
	private String nombre;
	private String grupoInvestigacion;
	private Date fechaEntrega;
	private Integer anio;
	private Integer semestre;

	public InformeDTO(Integer id, String nombre, String grupoInvestigacion, Date fechaEntrega, Integer anio,
			Integer semestre) {
		this.id = id;
		this.nombre = nombre;
		this.grupoInvestigacion = grupoInvestigacion;
		this.fechaEntrega = fechaEntrega;
		this.anio = anio;
		this.semestre = semestre;
	}

	public InformeDTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGrupoInvestigacion() {
		return grupoInvestigacion;
	}

	public void setGrupoInvestigacion(String grupoInvestigacion) {
		this.grupoInvestigacion = grupoInvestigacion;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
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
}
