package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;


public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	
	public FuerzaArmada() {
		super();
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}


	public Boolean agregarVehiculo(Vehiculo nuevo) {
		for(Vehiculo v: convoy){
			if(v.getId().equals(nuevo.getId())){
				return false;
			}
		}
		this.convoy.add(nuevo);
		return true;
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud,
			Double longitud) {
		this.batallas.put(nombre, new Batalla(tipo));
	}

	
	public Boolean enviarALaBatalla(String nombre, Integer id) throws VehiculoIncompatible, VehiculoInexistente {

		Batalla nueva=batallas.get(nombre);

		switch(nueva.getTipo()){
		case TERRESTRE:
			for(Vehiculo v: convoy){
				if(v instanceof Terrestre){
					if(v.getId().equals(id)){
						return true;
					}
				}else{
					throw new VehiculoIncompatible("No esta permitido");
				}

			}
			break;
		case NAVAL:
			for(Vehiculo v: convoy){
				if(v instanceof Acuatico){
					if(v.getId().equals(id)){
						return true;
					}
				}else{
					throw new VehiculoIncompatible("No esta permitido");
				}

			}
			break;
		case AEREA:
			for(Vehiculo v: convoy){
				if(v instanceof Volador){
					if(v.getId().equals(id)){
						return true;
					}
				}else{
					throw new VehiculoIncompatible("No esta permitido");
				}

			}
			break;
		}
		
		throw new VehiculoInexistente("el vehiculo no existe");
			
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


	public Batalla getBatalla(Batalla nombre) {
		// TODO Auto-generated method stub
		return nombre;
	}


	



	
	
	

}
