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
		this.setLatitud(nuevaLatitud);
		this.setLongitud(nuevaLongitud);
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result
				+ ((longitud == null) ? 0 : longitud.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedioTransporte other = (MedioTransporte) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		return true;
	}



	
	
	
	
}
