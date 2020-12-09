package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre{

	private Double velocidad;
	
	public Camion(Integer id, String nombre) {
		super(id, nombre);
		this.velocidad=0.0;
	}

	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

}
