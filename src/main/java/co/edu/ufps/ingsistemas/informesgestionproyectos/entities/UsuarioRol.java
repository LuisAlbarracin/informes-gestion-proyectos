package co.edu.ufps.ingsistemas.informesgestionproyectos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToMany
	private TipoUsuario rol;
	@ManyToMany
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
