package Test;

import org.junit.Assert;
import org.junit.Test;

public class test {

	@Test (expected = Exception.class)
	public void verificarMetodoDividir() throws Exception{
		
		Calculadora calcu1=new Calculadora(3d,0d);
		
		calcu1.dividir(3d, 0d);
		
		Assert.assertEquals(calcu1, 0d);;
	
	}
	
	@Test 
	public void verificarDividir(){
		
		Calculadora calcu1=new Calculadora(3d,0d);
		
		try {
			calcu1.dividir(3d, 0d);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		
	
	}
}
