package ar.edu.unlam;

public class CajaAhorro extends Cuenta{
	
	private Double costoAdicional;

	public CajaAhorro(Integer id, Double saldo, Cliente cliente, Double costoAdicional) {
		super(id, saldo, cliente);
		this.costoAdicional=costoAdicional;
	}


	
	@Override
	public void extraer(Double monto) {
		Integer contador=0;
		
		if(this.getSaldo()>=monto && contador<=3){
			this.setSaldo(getSaldo()-monto);
			contador++;
		}
		if(this.getSaldo()>=monto && contador>3)
				this.setSaldo(getSaldo()-this.costoAdicional-monto);
			}
		


	@Override
	public void depositar(Double monto) {
		this.setSaldo(getSaldo()+monto);
	}


	public Double getCostoAdicional() {
		return costoAdicional;
	}

	public void setCostoAdicional(Double costoAdicional) {
		this.costoAdicional = costoAdicional;
	}
	
	

	
}
