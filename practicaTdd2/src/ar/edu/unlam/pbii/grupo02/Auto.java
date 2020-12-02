package ar.edu.unlam.pbii.grupo02;

public class Auto extends MedioTransporte{
	
	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente=patente;
		this.cantidadMaximaDePasajeros=cantidadMaximaDePasajeros;
		this.velocidadMaxima=velocidadMaxima;
	}

	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * @return the cantidadDePasajeros
	 */
	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	/**
	 * @param cantidadDePasajeros the cantidadDePasajeros to set
	 */
	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}

	/**
	 * @return the velocidadMaxima
	 */
	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	/**
	 * @param velocidadMaxima the velocidadMaxima to set
	 */
	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

}
