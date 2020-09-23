package Test;

public class Calculadora {
	
	private Double dividendo;
	private Double divisor;
	
	
	
	public Calculadora(Double dividendo, Double divisor) {
		
		this.dividendo = dividendo;
		this.divisor = divisor;
	}


//excepciones tipo chequeada (significa que estas obligado a tratarla)
//las que derivan de rand time xception no es necesario tratarlas
	public Double dividir(Double dividendo, Double divisor) throws Exception{
		Double resultado=0d;
		if(divisor!=0){
			resultado=dividendo/divisor;
			return resultado;

		}else{
			throw new Exception("no se puede dividir por cero");
		}
	}



	public Double getDividendo() {
		return dividendo;
	}



	public void setDividendo(Double dividendo) {
		this.dividendo = dividendo;
	}



	public Double getDivisor() {
		return divisor;
	}



	public void setDivisor(Double divisor) {
		this.divisor = divisor;
	}
	
	

}
