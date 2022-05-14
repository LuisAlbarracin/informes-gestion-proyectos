package co.edu.ufps.ingsistemas.informesgestionproyectos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entrega")
public class Entrega {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer anio;
	private Integer semestre;
	@Column(name = "ruta_archivo")
	private String rutaArchivo;
	@Column(name = "fecha_inicio")
	private Date fechaInicio;
	@Column(name = "fecha_fin")
	private Date fechaFin;

	public Entrega(Integer id, Integer anio, Integer semestre, String rutaArchivo, Date fechaInicio, Date fechaFin) {
		this.id = id;
		this.anio = anio;
		this.semestre = semestre;
		this.rutaArchivo = rutaArchivo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public Entrega() {
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

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
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
