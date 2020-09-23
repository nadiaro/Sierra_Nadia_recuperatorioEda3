package enunciado;

public class SobrepesoException extends Exception {

	public SobrepesoException (String mensaje) {
		super("El vehiculo ha excedido su peso maximo");
	}
}
