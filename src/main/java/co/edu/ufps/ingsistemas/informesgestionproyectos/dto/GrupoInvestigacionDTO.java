package co.edu.ufps.ingsistemas.informesgestionproyectos.dto;

public class GrupoInvestigacionDTO {

	private Integer id;
	private String codigoColciencias;
	private String facultad;
	private String nombre;
	private String director;

	public GrupoInvestigacionDTO(Integer id, String codigoColciencias, String facultad, String nombre,
			String director) {
		this.id = id;
		this.codigoColciencias = codigoColciencias;
		this.facultad = facultad;
		this.nombre = nombre;
		this.director = director;
	}

	public GrupoInvestigacionDTO() {
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

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}
