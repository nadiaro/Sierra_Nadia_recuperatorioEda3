package ejercicio.lista.banco;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestCliente {

	@Test
	public void pruebaQueCreaUnCliente() {
		
		Banco miBanco=new Banco("money");
		
		Cliente nadia= new Cliente(28532901, "nadia", "sierra");
		
		Cuenta mia=new CajaDeAhorro(1,200.0d,nadia);
		
		miBanco.agregarCuenta(mia);
		
		Integer ve=1;
		Integer vo= miBanco.getListaCuentas();
		
		assertEquals(ve,vo);
		
	}

	@Test
	public void testQueVerificaQueUnaRealizaUnaExtracion() {
				
		Cliente nadia= new Cliente(28532901, "nadia", "sierra");
		
		Cuenta uno=new CajaDeAhorro(1,2000.0,nadia );
		
		uno.extraer(800.0);
		
		Double saldoEsperado=1200.0;
		
		assertEquals(saldoEsperado, uno.getSaldo());
	}

	@Test
	public void testQueVerificaQueUnaRealizaUndeposito() {
				
		Cliente nadia= new Cliente(28532901, "nadia", "sierra");
		
		Cuenta uno=new CajaDeAhorro(1,2000.0,nadia );
		
		uno.depositar(800.0);
		
		Double saldoEsperado=2800.0;
		
		assertEquals(saldoEsperado, uno.getSaldo());
	}
	
	@Test
	public void testQueVerificaQueUnaRealizaUnaExtracionCuentaCorriente() {
				
		Cliente nadia= new Cliente(28532901, "nadia", "sierra");
		
		Cuenta uno=new CuentaCorriente(1,1000.0,nadia,2000.0,0.10);
		
		uno.extraer(800.0);
		
		Double saldoEsperado=200.0;
		
		assertEquals(saldoEsperado, uno.getSaldo());
	}

	@Test
	public void testQueVerificaQueUnaRealizaUnDepositoEnCuentaCorriente() {
				
		Cliente nadia= new Cliente(28532901, "nadia", "sierra");
		
		Cuenta uno=new CuentaCorriente(1,1000.0,nadia,2000.0,0.10);
		
		uno.depositar(800.0);
		
		Double saldoEsperado=1800.0;
		
		assertEquals(saldoEsperado, uno.getSaldo());
	}

	@Test
	public void testQueVerificaQueUnaOperacionDescubiertoEnCuentaCorriente() {
				
		Cliente nadia= new Cliente(28532901, "nadia", "sierra");
		
		Cuenta uno=new CuentaCorriente(1,0.0,nadia,200.0,0.10);
		
		uno.extraer(300.0);
		
		Double saldoEsperado=-100.0;
		
		assertEquals(saldoEsperado, uno.getSaldo());
	}

	
	@Test
	public void testQueBuscaUnaCuentaPorId() {

		Banco miBanco=new Banco("money");
		
		Cliente nadia= new Cliente(28532901, "nadia", "sierra");
		Cliente roi= new Cliente(28532990, "roi", "roger");

		Cuenta uno=new CajaDeAhorro(1,2000.0,nadia );
		Cuenta dos=new CajaDeAhorro(2,2000.0,roi );
		
		miBanco.agregarCuenta(uno);
		miBanco.agregarCuenta(dos);

		try {
			assertTrue(miBanco.buscarCuentaConIterator(2));
		} catch (cuentaNoExistenteException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testQueVerificaUnaTransferenciaExistosEntre2Cuentas() {
		
		Banco miBanco=new Banco("money");
		
		Cliente nadia= new Cliente(28532901, "nadia", "sierra");
		Cliente roi= new Cliente(28532990, "roi", "roger");

		Cuenta uno=new CajaDeAhorro(1,2000.0,nadia );
		Cuenta dos=new CajaDeAhorro(2,2000.0,roi );
		
		miBanco.agregarCuenta(uno);
		miBanco.agregarCuenta(dos);
		
		try {
			assertTrue(miBanco.transferir(1, 2, 2000.0));
		} catch (saldoInsuficienteException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testQueEliminaUnaCuenta() {

		Banco miBanco=new Banco("money");
		
		Cliente nadia= new Cliente(28532901, "nadia", "sierra");
		Cliente roi= new Cliente(28532990, "roi", "roger");

		Cuenta uno=new CajaDeAhorro(1,2000.0,nadia );
		Cuenta dos=new CajaDeAhorro(2,2000.0,roi );
		
		miBanco.agregarCuenta(uno);
		miBanco.agregarCuenta(dos);
		
		try {
			assertTrue(miBanco.eliminarCuentaPorId(2));
		} catch (cuentaNoExistenteException e) {
			e.printStackTrace();
		}
}
}