package ar.edu.unlam;

public class Cliente {

	private String nombre;
	private String apellido;
	private Integer dni;
	
	public Cliente(String nombre, String apellido, Integer dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the dni
	 */
	public Integer getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	
}
