package parcial.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	private Long identificacion;
	private String nombre;
	private String apellido;
	private Integer telefono;
	private String sexo;
	private String estadoCivil;

	public Usuario() {
	}

	public Usuario(Long identificacion, String nombre, String apellido, Integer telefono, String sexo,
			String estadoCivil) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}
	
	
	

	public Long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
