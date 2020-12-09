package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico{

	private Double profundidad;
	private Double velocidad;
	
	public Anfibio(Integer id, String nombre) {
		super(id, nombre);
		this.profundidad=0.0;
		this.velocidad=0.0;

	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

	
}
