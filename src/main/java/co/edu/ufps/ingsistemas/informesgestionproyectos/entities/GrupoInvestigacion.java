package co.edu.ufps.ingsistemas.informesgestionproyectos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "grupo_investigacion")
public class GrupoInvestigacion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="codigo_colciencias")
	private String codigoColciencias;
	@ManyToOne
	private Facultad facultad;
	private String nombre;
	@OneToOne
	private Director director;

	public GrupoInvestigacion(Integer id, String codigoColciencias, Facultad facultad, String nombre,
			Director director) {
		this.id = id;
		this.codigoColciencias = codigoColciencias;
		this.facultad = facultad;
		this.nombre = nombre;
		this.director = director;
	}

	public GrupoInvestigacion() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoColciencias() {
		return codigoColciencias;
	}

	public void setCodigoColciencias(String codigoColciencias) {
		this.codigoColciencias = codigoColciencias;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

}
