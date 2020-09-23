package Test;

public class UsuarioInexistenteException extends Exception {
	
	public UsuarioInexistenteException(){
		super("el usuario no existe");
	}

}
