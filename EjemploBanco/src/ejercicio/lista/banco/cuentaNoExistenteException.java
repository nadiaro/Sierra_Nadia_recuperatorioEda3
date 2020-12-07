package ejercicio.lista.banco;

public class cuentaNoExistenteException extends Exception {
	
	public cuentaNoExistenteException(String mensaje){
		super("la cuenta no existe");
	}

}
