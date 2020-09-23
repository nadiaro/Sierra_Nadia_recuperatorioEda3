package enunciado;

public class VehiculoNotFoundException extends Exception {
	
	public VehiculoNotFoundException (String mensaje) {
		super("el vehiculo no existe");
	}

}
