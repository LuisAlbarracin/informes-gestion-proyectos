package co.edu.ufps.ingsistemas.informesgestionproyectos.dto;

public class RepresentanteDTO {

	private Integer id;
	private String nombre;
	private String correo;
	private String facultad;

	public RepresentanteDTO() {
	}

	public RepresentanteDTO(Integer id, String nombre, String correo, String facultad) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.facultad = facultad;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

}
