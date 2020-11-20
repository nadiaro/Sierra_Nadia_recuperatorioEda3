package ar.edu.unlam;

public class CuentaSueldo extends Cuenta{
	
	
	public CuentaSueldo(Integer id, Double saldo, Cliente cliente) {
		super(id, saldo, cliente);
}

	
	@Override
	public Boolean extraer(Double monto){
		if(this.getSaldo()>=monto){
			if(this.getSaldo()>=0d){
				this.setSaldo(getSaldo()-monto);
				return true;
			}
		}
		 return false;
	}

	@Override
	public void depositar(Double monto) {
		this.setSaldo(getSaldo()+monto);
	}
	
	

}
