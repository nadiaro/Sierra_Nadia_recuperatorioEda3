package ar.edu.unlam;

public class CuentaCorriente extends Cuenta {

	private Double limite;
	private Double interesDescubierto;
	
	
	public CuentaCorriente(Integer id, Double saldo, Cliente cliente, Double limite, Double interesDescubierto) {
		super(id, saldo, cliente);
		this.interesDescubierto=interesDescubierto;
		this.limite=limite;
	}

	private Double calcularInteresPorDescubierto() {
		
		return this.interesDescubierto*this.getSaldo();
	}

	@Override
	public void extraer(Double monto) {

		if(this.getSaldo()>=monto){
			this.setSaldo(getSaldo()-monto);
		}else{
				this.setSaldo(getSaldo()+ this.limite-calcularInteresPorDescubierto()-monto);
			}
		}
	


	@Override
	public void depositar(Double monto) {
		this.setSaldo(getSaldo()+monto);
	}


	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public Double getInteresDescubierto() {
		return interesDescubierto;
	}

	public void setInteresDescubierto(Double interesDescubierto) {
		this.interesDescubierto = interesDescubierto;
	}
	
	
	
	
}


//La más compleja de las cuentas, ésta permite establecer una cantidad de dinero a
//girar en descubierto. Es por ello que cada vez que se desee extraer dinero, no sólo
//se considera el que se posee, sino el límite adicional que el banco estará brindando.
//Por supuesto esto no es gratis, ya que el banco nos cobrará un 5% como comisión
//sobre todo el monto en descubierto consumido en la operación.
//Por ejemplo, si tuviéramos $ 100 en la cuenta, y quisiéramos retirar $ 200 (con un
//descubierto de $ 150), podremos hacerlo. Pasaremos a deberle al banco $ 105 en
//total: los $ 100 que nos cubrió, más el 5% adicional sobre el descubierto otorgado.