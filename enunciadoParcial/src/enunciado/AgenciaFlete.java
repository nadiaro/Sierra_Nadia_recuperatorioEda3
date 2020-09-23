package enunciado;
import enunciado.Vehiculo;
import enunciado.SobrepesoException;
import enunciado.VehiculoNotFoundException;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class AgenciaFlete {
	
	private Set<Vehiculo> flota;
	
	
	public AgenciaFlete() {
		this.flota=new HashSet<Vehiculo>();
	}
	
//	public AgenciaFlete(Comparator <Vehiculo> orden) { //le indico un nuevo modo de ordenamiento 
//		this.flota= new TreeSet<Vehiculo>(orden);
//	}

	public  Boolean agregarVehiculo(Vehiculo vehiculo) { // Agrega Un vehiculo a la flota
			if(flota.contains(vehiculo)) {
				return false;
			}
			flota.add(vehiculo);
			return true;
	}
		
		
	// * Busca Un vehiculo por patente y si no lo encuentra devuelve VehiculoNotFoundException
	public Vehiculo buscarVehiculo(String patente) throws VehiculoNotFoundException {
		
		for(Vehiculo lista: flota) {
			if(lista.getPatente().equals(patente)) {
				return lista;
			}
		}
		throw new VehiculoNotFoundException ("el vehiculo no existe");
	}

	
	public void descargarCargasVehiculo (String patente) throws VehiculoNotFoundException {
		Vehiculo vehiculo= this.buscarVehiculo(patente);
		vehiculo.getCargas().clear();
	}
	
	
	// Transfiere todas las carga de un vehiculo 
	public Boolean moverCargaDeUnVehiculoAOtro(String patenteOrigen, String patenteDestino) 
			throws VehiculoNotFoundException, SobrepesoException {
		
			Vehiculo vehiculoUno=buscarVehiculo(patenteOrigen);
			Vehiculo vehiculoDos=buscarVehiculo(patenteDestino);
			
			if(!(vehiculoUno.equals(null))&& !(vehiculoDos.equals(null))){
				
				if(vehiculoUno.obtenerPesoCargado()+vehiculoDos.obtenerPesoCargado()<=vehiculoUno.getPesoMaximo()){
				
				List <Carga>cargaParaDestino=vehiculoUno.getCargas();
				List <Carga>cargaDeDestino=vehiculoDos.getCargas();
				descargarCargasVehiculo(patenteOrigen);
				
				for(Carga cargar: cargaParaDestino)
					cargaDeDestino.add(cargar);
				return true;
				}
				throw new SobrepesoException("El vehiculo ha excedido su peso maximo");

			}
					throw new VehiculoNotFoundException("el vehiculo no existe");
}
			
		
		
	
	// Devuelve una lista ordenada de los vehiculos. No modifica la lista Existente
	public Set<Vehiculo> obtenerListaOrdenada (Comparator <Vehiculo> orden){
		Set<Vehiculo>listaOrdenada=new TreeSet<>(orden);
		listaOrdenada.addAll(this.flota);
		return (TreeSet <Vehiculo>) listaOrdenada;
		
	}
	}


