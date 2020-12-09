package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Volador{

	private Double altura;
	
	public Portaviones(Integer id, String nombre) {
		super(id, nombre);
		this.altura=0.0;
	}

	public Double getAltura() {
		// TODO Auto-generated method stub
		return this.altura;
	}

}
