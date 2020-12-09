package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre{

	private Double velocidad;
	
	public Tanque(Integer id, String nombre) {
		super(id, nombre);
		this.velocidad=0.0;
	}

	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	
}
