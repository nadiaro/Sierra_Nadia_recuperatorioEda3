package ar.edu.unlam.pbii.grupo02;

public class Moto extends MedioTransporte {
	
	private String patente;
	private final Integer CAPACIDA_MAXIMA_DE_PASAJEROS;
	private Integer velocidadMaxima;

	public Moto(String patente,Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente=patente;
		this.CAPACIDA_MAXIMA_DE_PASAJEROS=2;
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

	/**
	 * @return the cAPACIDA_MAXIMA_DE_PASAJEROS
	 */
	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}

}
