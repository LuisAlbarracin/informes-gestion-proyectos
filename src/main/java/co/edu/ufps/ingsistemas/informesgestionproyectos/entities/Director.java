package co.edu.ufps.ingsistemas.informesgestionproyectos.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Director {
	private Integer id;
	private String codigo;
	private String nombre;
	@OneToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public Director(Integer id, String codigo, String nombre, Usuario usuario) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.usuario = usuario;
	}

	public Director() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
