package ejercicio.lista.banco;

public class CuentaCorriente extends Cuenta{
	

		private Double limiteDescubierto;
		private Double interes;
		

		public CuentaCorriente(Integer id, Double saldo, Cliente cliente,
				Double limiteDescubierto, Double interes) {
			
			super(id, saldo, cliente);
			this.limiteDescubierto = limiteDescubierto;
			this.interes = 1d;
		}

		
		public Double getLimiteDescubierto() {
			return limiteDescubierto;
		}


		public void setLimiteDescubierto(Double limiteDescubierto) {
			this.limiteDescubierto = limiteDescubierto;
		}


		public Double getInteres() {
			return interes;
		}


		public void setInteres(Double interes) {
			this.interes = interes;
		}


		@Override
		public void extraer(Double monto) {
			Double adeudado=0.0;
			if (this.getSaldo()+this.limiteDescubierto >=monto){
				this.setSaldo(getSaldo()-monto);
			}else{
				adeudado=this.interes*getSaldo();
				this.setSaldo(this.getSaldo()+this.limiteDescubierto-adeudado-monto);
			}
		}

		@Override
		public void depositar(Double monto) {
			this.setSaldo(getSaldo()+monto);
		}
		

	}



