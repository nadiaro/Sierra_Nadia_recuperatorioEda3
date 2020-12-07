package ejercicio.lista.banco;

import java.util.Comparator;

public class ordenarPorIdCliente implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta c1, Cuenta c2) {
		return c1.getId().compareTo(c2.getId());
	}
	
	

}
