package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.Comercio;
import ar.edu.unlam.Producto;

public class TestColecciones {

	@Test
	public void testWueSeAgregueUnProductoAunComercio() {

	Producto p1= new Producto ("uno23","termo",40.0);
	Comercio uno=new Comercio ("juancito");
	
	assertTrue(uno.agregarProductoAcomercio(p1));
	}
	
	@Test
	public void buscarProductoPorCodigo(){
		
		Producto p1= new Producto ("uno23","termo",40.0);
		Comercio uno=new Comercio ("juancito");
		
		uno.agregarProductoAcomercio(p1);
		
		String codigo="uno23";
		
		assertEquals(codigo, uno.buscarProductoPorCodigo(p1.getCodigo()));
	}

}
