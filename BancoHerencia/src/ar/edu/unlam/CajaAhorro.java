package ar.edu.unlam;

public class CajaAhorro extends Cuenta{
	
	private Double costoAdicional;
	private Integer cantidadExtracciones;

	public CajaAhorro(Integer id, Double saldo, Cliente cliente, Double costoAdicional) {
		super(id, saldo, cliente);
		this.costoAdicional=costoAdicional;
		this.cantidadExtracciones=0;
	}


	
	@Override
	public void extraer(Double monto) {
		
		if(this.getSaldo()>=monto && this.cantidadExtracciones<=3){
			this.setSaldo(getSaldo()-monto);
			this.cantidadExtracciones++;
		}
		if(this.getSaldo()>=monto && this.cantidadExtracciones>=4)
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
