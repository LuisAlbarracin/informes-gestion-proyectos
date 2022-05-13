package co.edu.ufps.ingsistemas.informesgestionproyectos.dto;

public class DirectorDTO {

	private Integer id;
	private String codigo;
	private String nombre;
	private String email;
	private String grupoInvestigacion;

	public DirectorDTO() {
	}

	public DirectorDTO(Integer id, String codigo, String nombre, String email, String grupoInvestigacion) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
		this.grupoInvestigacion = grupoInvestigacion;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrupoInvestigacion() {
		return grupoInvestigacion;
	}

	public void setGrupoInvestigacion(String grupoInvestigacion) {
		this.grupoInvestigacion = grupoInvestigacion;
	}
}
