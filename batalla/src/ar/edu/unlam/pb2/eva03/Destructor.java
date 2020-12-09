package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Terrestre, Acuatico {

	private Double velocidad;
	private Double profundiad;
	
	public Destructor(Integer id, String nombre) {
		super(id, nombre);
		this.profundiad=0.0;
		this.velocidad=0.0;
	}

	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundiad;
	}

}
