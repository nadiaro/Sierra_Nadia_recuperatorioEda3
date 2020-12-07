package ejercicio.lista.banco;

public class CajaDeAhorro extends Cuenta{


	public CajaDeAhorro(Integer id, Double saldo, Cliente cliente) {
		super(id, saldo, cliente);
		
	}
    
	public void extraer(Double monto) {
		if (this.getSaldo()>=monto&&monto>0.0){
			
			this.setSaldo(getSaldo()-monto);
		}
	}
    
	public void depositar(Double monto){
    	this.setSaldo(this.getSaldo()+monto);		
	}

	
	

}
