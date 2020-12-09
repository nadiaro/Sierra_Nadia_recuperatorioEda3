package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico{

	private Double profundidad;
	
	public Submarino(Integer id, String nombre) {
		super(id, nombre);
		this.profundidad=0.0;
	}

	public Double getProfundidad() {
		return this.profundidad;
	}
	
	

}
