package co.edu.ufps.ingsistemas.informesgestionproyectos.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {

	private TipoUsuario rol;
	private Usuario usuario;

	public UsuarioRol(TipoUsuario rol, Usuario usuario) {
		super();
		this.rol = rol;
		this.usuario = usuario;
	}

	public UsuarioRol() {
		super();
	}

	public TipoUsuario getRol() {
		return rol;
	}

	public void setRol(TipoUsuario rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
