package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico {

	private Double profundiad;
	
	public Destructor(Integer id, String nombre) {
		super(id, nombre);
		this.profundiad=0.0;
	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundiad;
	}

}
