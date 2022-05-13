package co.edu.ufps.ingsistemas.informesgestionproyectos.dto;

import java.util.List;

public class UsuarioDTO {
	
	private Integer id;
	private String email;
	private String contrasenia;
	private Boolean activo;
	private List<String> roles;

	public UsuarioDTO(Integer id, String email, String contrasenia, Boolean activo) {
		this.id = id;
		this.email = email;
		this.contrasenia = contrasenia;
		this.activo = activo;
	}

	public UsuarioDTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}
