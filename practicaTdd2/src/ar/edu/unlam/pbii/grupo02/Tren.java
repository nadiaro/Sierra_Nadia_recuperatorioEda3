package ar.edu.unlam.pbii.grupo02;

public class Tren extends MedioTransporte{

	private Integer cantidadDeVagones;
	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;
	
	public Tren(Integer cantidadDeVagones,Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.velocidadMaxima=velocidadMaxima;
		this.cantidadDePasajerosPorVagon=cantidadDePasajerosPorVagon;
		this.cantidadDeVagones=cantidadDeVagones;
	}

	/**
	 * @return the cantidadDevagones
	 */
	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	/**
	 * @param cantidadDevagones the cantidadDevagones to set
	 */
	public void setCantidadDevagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	/**
	 * @return the cantidadDePasajerosPorVagon
	 */
	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	/**
	 * @param cantidadDePasajerosPorVagon the cantidadDePasajerosPorVagon to set
	 */
	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
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
