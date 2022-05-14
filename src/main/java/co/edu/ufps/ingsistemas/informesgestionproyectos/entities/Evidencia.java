package co.edu.ufps.ingsistemas.informesgestionproyectos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "evidencia")
public class Evidencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Informe informe;
	@ManyToOne
	@Column(name = "tipo_evidencia")
	private TipoEvidencia tipoEvidencia;
	private String nombre;
	@Column(name = "ruta_evidencia")
	private String rutaEvidencia;

	public Evidencia(Integer id, Informe informe, TipoEvidencia tipoEvidencia, String nombre, String rutaEvidencia) {
		this.id = id;
		this.informe = informe;
		this.tipoEvidencia = tipoEvidencia;
		this.nombre = nombre;
		this.rutaEvidencia = rutaEvidencia;
	}

	public Evidencia() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Informe getInforme() {
		return informe;
	}

	public void setInforme(Informe informe) {
		this.informe = informe;
	}

	public TipoEvidencia getTipoEvidencia() {
		return tipoEvidencia;
	}

	public void setTipoEvidencia(TipoEvidencia tipoEvidencia) {
		this.tipoEvidencia = tipoEvidencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRutaEvidencia() {
		return rutaEvidencia;
	}

	public void setRutaEvidencia(String rutaEvidencia) {
		this.rutaEvidencia = rutaEvidencia;
	}

}
