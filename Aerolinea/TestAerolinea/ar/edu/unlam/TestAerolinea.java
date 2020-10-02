package ar.edu.unlam;

import org.junit.Assert;
import org.junit.Test;


public class TestAerolinea {

	@Test
	public void testVerificaAgregarPasajero() {

		Vuelo justo= new Vuelo("Ezeiza", "China");
		
		Pasajero nadia= new Pasajero(28333444,"Nadia", "Sierra");
				
		
		Assert.assertTrue(justo.agregarPasajero(nadia));
	
	}

	@Test
	public void testVerificaBuscarPasajero() {

		Vuelo justo= new Vuelo("Ezeiza", "China");
		
		Pasajero nadia= new Pasajero(28333444,"Nadia", "Sierra");
		Pasajero romi=new Pasajero(28333445,"Romina", "Sierra");

		justo.agregarPasajero(nadia);
		justo.agregarPasajero(romi);
		
		Integer esperado=28333444;
		
		Assert.assertEquals(esperado, nadia.getDni());
	
	}
	
	@Test
	public void testVerificaDisponibilidadAsiento(){
		
	}
	
	@Test
	public void testVerificaAsignarAsientoAPasajero(){
		
		Vuelo justo= new Vuelo("Ezeiza", "China");
		
		Pasajero nadia= new Pasajero(28333444,"Nadia", "Sierra");
		
		Asiento uno=new Asiento(2,3,false);
		
		Assert.assertTrue(justo.asignarAsiento(nadia,uno));
		
	}

}
