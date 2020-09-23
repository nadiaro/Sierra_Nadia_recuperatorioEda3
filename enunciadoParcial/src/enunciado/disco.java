package enunciado;

public class disco {
	
	private Integer radioInterior;
	private Integer radioExterior;
		
	
	public disco(Integer radioInterior, Integer radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		}


	public Double calcularSuperficie(){
		return this.radioExterior*this.radioExterior*Math.PI-this.radioInterior*this.radioInterior*Math.PI;
	}
	
	public Double calcularPerimetroExterior(){
		return 2*Math.PI*this.radioExterior;
	}

	public Double calcularPerimetroInterior(){
		return 2*Math.PI*this.radioInterior;
	}


	public Integer getRadioInterior() {
		return radioInterior;
	}


	public void setRadioInterior(Integer radioInterior) {
		this.radioInterior = radioInterior;
	}


	public Integer getRadioExterior() {
		return radioExterior;
	}


	public void setRadioExterior(Integer radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	
}
