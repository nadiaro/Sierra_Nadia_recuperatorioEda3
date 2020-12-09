package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Terrestre, Volador, Acuatico{

	private Double velocidad;
	private Double profundidad;
	private Double altura;
	
	public HidroAvion(Integer id, String nombre) {
		super(id, nombre);
		this.profundidad=0.0;
		this.velocidad=0.0;
		this.altura=0.0;
	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

	public Double getAltura() {
		// TODO Auto-generated method stub
		return this.altura;
	}

	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

	
}
