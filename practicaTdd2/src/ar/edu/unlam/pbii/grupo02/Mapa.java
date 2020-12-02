package ar.edu.unlam.pbii.grupo02;

import java.util.HashSet;
import java.util.Set;

public class Mapa {
	
	private String nombreCiudad;
	private Integer cantidadDeVehiculos;
	private Set<MedioTransporte>vehiculos;

	public Mapa(String nombreCiudad) {
		this.nombreCiudad=nombreCiudad;
		this.vehiculos=new HashSet<MedioTransporte>();
		this.cantidadDeVehiculos=0;
	}

	
	public void agregarVehiculo(MedioTransporte nuevo) {
		vehiculos.add(nuevo);
		cantidadDeVehiculos++;
	}
	
	public Boolean hayCoalicion() throws ColitionException{
		
		MedioTransporte uno=new MedioTransporte(50.0d, 50.0d);
		MedioTransporte dos=new MedioTransporte(50.0d, 50.0d);

		vehiculos.add(uno);
		vehiculos.add(dos);
		
		if(uno.getLatitud().equals(dos.getLatitud())){
			if(uno.getLongitud().equals(dos.getLongitud())){
				throw new ColitionException ("Chocaron");

			}
		}
		return true;
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
		return cantidadDeVehiculos;
	}


	/**
	 * @param cantidadDeVehiculos the cantidadDeVehiculos to set
	 */
	public void setCantidadDeVehiculos(Integer cantidadDeVehiculos) {
		this.cantidadDeVehiculos = cantidadDeVehiculos;
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
