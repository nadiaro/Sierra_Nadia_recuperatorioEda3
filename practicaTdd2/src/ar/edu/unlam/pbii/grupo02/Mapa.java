package ar.edu.unlam.pbii.grupo02;

import java.util.HashSet;
import java.util.Set;

public class Mapa {
	
	private String nombreCiudad;
	private Set<MedioTransporte>vehiculos;

	
	public Mapa(String nombreCiudad) {
		this.nombreCiudad=nombreCiudad;
		this.vehiculos=new HashSet<MedioTransporte>();
	}

	
	public void agregarVehiculo(MedioTransporte nuevo) {
		vehiculos.add(nuevo);
	}
	
	public Boolean hayCoalición() throws ColitionException{
		Boolean chocaron=false;
		for(MedioTransporte x: vehiculos){
			for(MedioTransporte p: vehiculos){
				if(x!=p && x.getLatitud().equals(p.getLatitud())&& x.getLongitud().equals(p.getLongitud())){
					chocaron=true;
					throw new ColitionException("Chocaron");
				}
			}
		}
		return chocaron;
	}

			
	/**
	 * @return the vehiculos
	 */
	public Set<MedioTransporte> getVehiculos() {
		return vehiculos;
	}


	/**
	 * @param vehiculos the vehiculos to set
	 */
	public void setVehiculos(Set<MedioTransporte> vehiculos) {
		this.vehiculos = vehiculos;
	}


	/**
	 * @return the cantidadDeVehiculos
	 */
	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}


	/**
	 * @return the nombreCiudad
	 */
	public String getNombreCiudad() {
		return nombreCiudad;
	}

	/**
	 * @param nombreCiudad the nombreCiudad to set
	 */
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

}
