package ejercicio.lista.banco;

public class saldoInsuficienteException extends Exception {
	
	public saldoInsuficienteException(String mensaje){
		super("la cuenta no tiene saldo");
	}

}
