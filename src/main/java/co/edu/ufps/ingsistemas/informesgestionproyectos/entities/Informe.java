package co.edu.ufps.ingsistemas.informesgestionproyectos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "informe")
public class Informe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Entrega entrega;
	private String nombre;
	@Column(name = "grupo_investigacion")
	@ManyToOne
	private GrupoInvestigacion grupoInvestigacion;
	@Column(name = "ruta_archivo")
	private String rutaArchivo;
	@Column(name = "fecha_entrega")
	private Date fechaEntrega;

	public Informe(Integer id, Entrega entrega, String nombre, GrupoInvestigacion grupoInvestigacion,
			String rutaArchivo, Date fechaEntrega) {
		this.id = id;
		this.entrega = entrega;
		this.nombre = nombre;
		this.grupoInvestigacion = grupoInvestigacion;
		this.rutaArchivo = rutaArchivo;
		this.fechaEntrega = fechaEntrega;
	}

	public Informe() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GrupoInvestigacion getGrupoInvestigacion() {
		return grupoInvestigacion;
	}

	public void setGrupoInvestigacion(GrupoInvestigacion grupoInvestigacion) {
		this.grupoInvestigacion = grupoInvestigacion;
	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
}
