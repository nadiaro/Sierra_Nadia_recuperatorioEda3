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
		Pasajero esperado=nadia;
		
		Assert.assertEquals(esperado, justo.buscarPasajero(28333444));
	
	}
	
	@Test
	public void testVerificaDisponibilidadAsiento(){
		
		Vuelo justo= new Vuelo("Ezeiza", "China");
		
		Asiento uno=new Asiento(2,3,true);

		Assert.assertFalse(justo.verificarDisponibilidadAsiento(uno)); //esta ocupado
	}
	
	@Test
	public void testVerificaAsignarAsientoAPasajero(){
		
		Vuelo justo= new Vuelo("Ezeiza", "China");
		
		Pasajero nadia= new Pasajero(28333444,"Nadia", "Sierra");
		
		Asiento uno=new Asiento(2,3,false);
				
		Assert.assertTrue(justo.asignarAsiento(nadia,uno));
		
	}

}
