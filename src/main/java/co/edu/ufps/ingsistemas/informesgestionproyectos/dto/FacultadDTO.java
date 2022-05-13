package co.edu.ufps.ingsistemas.informesgestionproyectos.dto;

public class FacultadDTO {
	
	private Integer id;
	private String nombre;
	private String decano;
	private String representante;

	public FacultadDTO() {
	}

	public FacultadDTO(Integer id, String nombre, String decano, String representante) {
		this.id = id;
		this.nombre = nombre;
		this.decano = decano;
		this.representante = representante;
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

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}
}
