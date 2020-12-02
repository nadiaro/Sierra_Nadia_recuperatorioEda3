package ar.edu.unlam.pbii.grupo02;

public class MedioTransporte {

	private Double latitud;
	private Double longitud;
	
	
	public MedioTransporte(Double latitud, Double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}


	/**
	 * @return the latitud
	 */
	public Double getLatitud() {
		return latitud;
	}


	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}


	/**
	 * @return the longitud
	 */
	public Double getLongitud() {
		return longitud;
	}


	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}


	public void actualizarCoordenadas(Double nuevaLatitud, Double nuevaLongitud) {
		MedioTransporte nuevo=new MedioTransporte(latitud, longitud);
		nuevo.setLatitud(nuevaLatitud);
		nuevo.setLongitud(nuevaLongitud);
	}



	
	
	
	
}
