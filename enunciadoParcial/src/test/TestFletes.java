package test;
import static org.junit.Assert.*;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

import enunciado.AgenciaFlete;
import enunciado.Camion;
import enunciado.Camioneta;
import enunciado.Carga;
import enunciado.OrdenarPorApellido;
import enunciado.SobrepesoException;
import enunciado.Vehiculo;
import enunciado.VehiculoNotFoundException;



public class TestFletes {
	
	@Test
	public void testQueVerificaAgregoUnaCargaACamioneta(){
		
		
		Vehiculo uno=new Camioneta("aabb2","Nadia", "Sierra",  50,2000);
		Carga camionetaUno=new Carga("galles", 45);
		
			
		try {
			Assert.assertTrue(uno.agregarCarga(camionetaUno));
		} catch (SobrepesoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test (expected=SobrepesoException.class)
	public void testQueVerificaQueNoAgregoUnacarga() throws SobrepesoException{
		
		Vehiculo uno=new Camioneta("aabb2","Nadia", "Sierra", 50,2000);
		
		Carga camionetaUno=new Carga("galles", 80);
		
		uno.agregarCarga(camionetaUno);
		
	}

	
	@Test
	public void testQueTransfiereCargaDeUnVehiculoAOtro(){
		
		Vehiculo uno=new Camion("aabb2","Nadia", "Sierra", 50,false);
		Vehiculo dos=new Camion("aabb3","Nadia", "Sierra", 100,true);
		
		AgenciaFlete miAgencia=new AgenciaFlete();
		
		miAgencia.agregarVehiculo(uno);
		miAgencia.agregarVehiculo(dos);
		
			
		Carga camionUno=new Carga("galles", 20);
		Carga camionDos=new Carga("galles",30);
		
		try {
			uno.agregarCarga(camionUno);
		} catch (SobrepesoException e) {
			e.printStackTrace();
		}
		try {
			dos.agregarCarga(camionDos);
		} catch (SobrepesoException e) {
			e.printStackTrace();
		}
		
		try {
			assertTrue(miAgencia.moverCargaDeUnVehiculoAOtro("aabb2", "aabb3"));
		} catch (VehiculoNotFoundException e) {
			e.printStackTrace();
		} catch (SobrepesoException e) {
			e.printStackTrace();
		}
				
	}
	
	
	@Test(expected=SobrepesoException.class)
	public void testQueVerificaQueNoSeTransfiereCargaEntreVehiculos() throws VehiculoNotFoundException, SobrepesoException{
		
		Vehiculo uno=new Camion("aabb2","Nadia", "Sierra", 50,false);
		Vehiculo dos=new Camion("aabb3","Nadia", "Sierra", 50,true);
		
		AgenciaFlete miAgencia=new AgenciaFlete();
		
		miAgencia.agregarVehiculo(uno);
		miAgencia.agregarVehiculo(dos);
		
			
		Carga camionUno=new Carga("galles", 40);
		Carga camionDos=new Carga("galles",90);
		
		uno.agregarCarga(camionUno);
		dos.agregarCarga(camionDos);
		
		miAgencia.moverCargaDeUnVehiculoAOtro("aabb2", "aabb3");
	}
	
	@Test
	public void verificarListaOrdenada(){
		
		Vehiculo uno=new Camion("aabb2","Nadia", "Sierra", 50,false);
		Vehiculo dos=new Camion("aabb3","Nadia", "Sierra", 50,true);
		Vehiculo tres=new Camion("aabb5","Nadia", "Sierra", 50,true);
		
		OrdenarPorApellido orden=new OrdenarPorApellido();
		
		AgenciaFlete miAgencia=new AgenciaFlete();
		
		miAgencia.agregarVehiculo(uno);
		miAgencia.agregarVehiculo(dos);
		miAgencia.agregarVehiculo(tres);

		
		Set<Vehiculo>listaOrdenadaEsperada=new TreeSet<>(orden);
		
		listaOrdenadaEsperada.add(uno);
		listaOrdenadaEsperada.add(dos);
		listaOrdenadaEsperada.add(tres);

		
		Set<Vehiculo>listaOrdenadaObtenida=miAgencia.obtenerListaOrdenada(orden);
		
		Assert.assertEquals(listaOrdenadaEsperada, listaOrdenadaObtenida);
		
		
	}
}
