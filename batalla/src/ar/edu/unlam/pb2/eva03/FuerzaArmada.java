package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	
	public FuerzaArmada() {
		super();
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}


	public void agregarVehiculo(Vehiculo nuevo) {
		this.convoy.add(nuevo);
	}


	/**
	 * @return the convoy
	 */
	public Set<Vehiculo> getConvoy() {
		return convoy;
	}


	/**
	 * @param convoy the convoy to set
	 */
	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}


	/**
	 * @return the batallas
	 */
	public Map<String, Batalla> getBatallas() {
		return batallas;
	}


	/**
	 * @param batallas the batallas to set
	 */
	public void setBatallas(Map<String, Batalla> batallas) {
		this.batallas = batallas;
	}


	public Integer getCapacidadDeDefensa() {
		// TODO Auto-generated method stub
		return convoy.size();
	} 
	
	

}
