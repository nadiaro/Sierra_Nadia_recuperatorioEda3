import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.CajaAhorro;
import ar.edu.unlam.Cliente;
import ar.edu.unlam.Cuenta;
import ar.edu.unlam.CuentaCorriente;
import ar.edu.unlam.CuentaSueldo;



public class TestCuenta {

	@Test
	public void testQueVerificaDepositarCuentaSueldo() {
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);
		
		Cuenta uno=new CuentaSueldo(01, 200.0d, nadia);
		
		uno.depositar(500.0d);
		
		Double esperado=700.0d;
		
		Assert.assertEquals(esperado, uno.getSaldo());
	}
	
	@Test
	public void testQueVerificaQueSePuedeExtraerCuentaSueldo(){
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);
		
		Cuenta uno=new CuentaSueldo(01, 200.0d, nadia);
		
		Boolean vo= uno.extraer(100.0d);
		
		Boolean esperado=true;
		
		Assert.assertEquals(esperado, vo);
		
	}
	
	@Test
	public void testQueVerificaDepositarCajaAhorro(){
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);

		Cuenta dos=new CajaAhorro(02, 2000.0d, nadia, 100.0d);
		
		dos.depositar(500.0d);
		
		Double esperado=2500.0d;
		
		Assert.assertEquals(esperado, dos.getSaldo());
	}
	
	@Test
	public void testQueVerificaExtraerCajaAhorro(){
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);

		Cuenta dos=new CajaAhorro(02, 1500.0d, nadia, 100.0d);
		
		dos.extraer(1000.0d);
		
		Double esperado=500.0d;
		
		Assert.assertEquals(esperado, dos.getSaldo());

}
	@Test
	public void testQueVerificaExtraerConCostoAdicionalCajaAhorro(){
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);

		Cuenta dos=new CajaAhorro(02, 10000.0d, nadia, 100.0d);
		
		dos.extraer(1000.0d);
		dos.extraer(1000.0d);
		dos.extraer(1000.0d);
		dos.extraer(1000.0d);

			
		Double esperado=4900.0d;		
		Assert.assertEquals(esperado, dos.getSaldo());

}
	
	
	@Test
	public void testQueVerificaDepositarCuentaCorriente(){
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);

		Cuenta tres=new CuentaCorriente(02, 2000.0d, nadia, 3000.0d, 0.05d);
		
		tres.depositar(500.0d);
		
		Double esperado=2500.0d;
		
		Assert.assertEquals(esperado, tres.getSaldo());
	}
	
	@Test
	public void testQueVerificaExtraerCuentaCorriente(){
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);

		Cuenta tres=new CuentaCorriente(02, 100.0d, nadia, 100.0d, 0.05d);
				
		Assert.assertTrue(tres.extraer(150.0d));

}
	
	@Test
	public void testQueverificaCobroPorGiroDescubiertoEnCuentaCorriente(){
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);

		Cuenta cuatro=new CuentaCorriente(02, 100.0d, nadia, 200.0d, 0.05d);
		
		cuatro.extraer(200.0d);
		
		Double esperado=105.0d;
		
		Assert.assertEquals(esperado, cuatro.getSaldo());
		
	}
}
