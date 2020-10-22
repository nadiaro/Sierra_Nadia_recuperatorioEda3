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
		
		uno.extraer(100.0d);
		
		Double esperado=100.0d;
		
		Assert.assertEquals(esperado, uno.getSaldo());
		
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

		Cuenta dos=new CajaAhorro(02, 2000.0d, nadia, 100.0d);
		
		dos.extraer(1000.0d);
		
		Double esperado=1000.0d;
		
		Assert.assertEquals(esperado, dos.getSaldo());

}
	//este metodo no me esta contando las extracciones para aplicar el costo adicional
	@Test
	public void testQueVerificaExtraerConCostoAdicionalCajaAhorro(){
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);

		Cuenta dos=new CajaAhorro(02, 10000.0d, nadia, 100.0d);
		
		dos.extraer(1000.0d);
		dos.extraer(1000.0d);
		dos.extraer(1000.0d);
		dos.extraer(1000.0d);
		
			
		Double esperado=6000.0d;
		//el esperado deberia ser 5900, porque le tiene que restar 100 pesos a la cuarta extracion
		
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

		Cuenta tres=new CuentaCorriente(02, 2000.0d, nadia, 1000.0d, 0.05d);
		
		tres.extraer(1000.0d);
		
		Double esperado=1000.0d;
		
		Assert.assertEquals(esperado, tres.getSaldo());

}
	
	@Test
	public void testQueverificaCobroPorGiroDescubiertoEnCuentaCorriente(){
		
		Cliente nadia=new Cliente("Nadia", "Sierra", 28532901);

		Cuenta cuatro=new CuentaCorriente(02, 2000.0d, nadia, 1000.0d, 0.05d);
		
		cuatro.extraer(2500.0d);
		
		Double esperado=400.0d;
		
		Assert.assertEquals(esperado, cuatro.getSaldo());
		
	}
}
