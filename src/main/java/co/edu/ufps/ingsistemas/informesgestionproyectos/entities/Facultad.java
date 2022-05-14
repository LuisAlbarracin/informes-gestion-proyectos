package co.edu.ufps.ingsistemas.informesgestionproyectos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facultad")
public class Facultad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String decano;

	public Facultad(Integer id, String nombre, String decano) {
		this.id = id;
		this.nombre = nombre;
		this.decano = decano;
	}

	public Facultad() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDecano() {
		return decano;
	}

	public void setDecano(String decano) {
		this.decano = decano;
	}
}
