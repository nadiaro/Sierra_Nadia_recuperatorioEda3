package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico{

	private Double profundidad;
	
	public Portaviones(Integer id, String nombre) {
		super(id, nombre);
		this.profundidad=0.0;
	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

}
