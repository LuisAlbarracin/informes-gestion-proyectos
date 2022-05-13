package co.edu.ufps.ingsistemas.informesgestionproyectos.dto;

public class EvidenciaDTO {

	private Integer id;
	private String nombre;
	private String tipoEvidencia;
	private String archivo;
	private String nombreInforme;

	public EvidenciaDTO() {
	}

	public EvidenciaDTO(Integer id, String nombre, String tipoEvidencia, String archivo, String nombreInforme) {
		this.id = id;
		this.nombre = nombre;
		this.tipoEvidencia = tipoEvidencia;
		this.archivo = archivo;
		this.nombreInforme = nombreInforme;
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

	public String getTipoEvidencia() {
		return tipoEvidencia;
	}

	public void setTipoEvidencia(String tipoEvidencia) {
		this.tipoEvidencia = tipoEvidencia;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getNombreInforme() {
		return nombreInforme;
	}

	public void setNombreInforme(String nombreInforme) {
		this.nombreInforme = nombreInforme;
	}
}
