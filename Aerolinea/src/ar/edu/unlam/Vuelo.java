package ar.edu.unlam;

import java.util.ArrayList;

public class Vuelo {

	private String origen;
	private String destino;
	private ArrayList<Pasajero>listaPasajeros;
	private ArrayList<Asiento>listaAsientos;
	
	
	
	public Vuelo(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
		this.listaPasajeros=new ArrayList<Pasajero>();
		this.listaAsientos=new ArrayList<Asiento>();
		
	}	
	
//	Incorpora un nuevo pasajero a la lista de pasajeros del
//	vuelo. Devuelve true si se pudo agregar o false si la capacidad del vuelo se
//	encuentra completa.
	
	
	public Boolean agregarPasajero (Pasajero pasajero){
		
		Boolean agregado=false;
					
				if(!listaPasajeros.contains(pasajero)){
						listaPasajeros.add(pasajero);
						
						return agregado=true;

					}
		    	return agregado;

			}
	
	
	// Verifica si el asiento indicado se encuentra disponible.

	public Boolean verificarDisponibilidadAsiento(Asiento asiento) {
				
		Boolean libre=false; //esta libre
			for(Asiento a:listaAsientos){
				
				if(a.getEstado().equals(false)){
					return libre;
			}	
				else{
				asiento.setEstado(true); //esta ocupado
				return libre=true;

			}
		}
			return libre;
	}
	
	
	
//	Busca un pasajero en la lista de pasajeros a partir del DNI. Si no
//	lo encuentra devuelve null.

	
	public Pasajero buscarPasajero(Integer dni) {
		
		for (Pasajero p:listaPasajeros){
			if(p.getDni().equals(dni)){
				return p;
			}
		}
		return null;
	}
	
	//asigna un asiento a un pasajero
	public Boolean asignarAsiento(Pasajero nuevo, Asiento nuevo2) {
		
		Boolean asignado=false;
			
			if(agregarPasajero(nuevo).equals(true)){
				
				if(verificarDisponibilidadAsiento(nuevo2).equals(false)){
				
					Vuelo vuelo=new Vuelo("origen","destino");
					vuelo.agregarPasajero(nuevo);
					
					return asignado=true;

			}
		}
			return asignado;
	}
	
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public ArrayList<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}
	
	public void setListaPasajeros(ArrayList<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	
	public ArrayList<Asiento> getListaAsientos() {
		return listaAsientos;
	}
	
	public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}	
	
}
