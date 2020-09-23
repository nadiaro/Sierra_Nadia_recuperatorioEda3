package enunciado;

import java.util.Comparator;

public class OrdenarPorApellido implements Comparator <Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
	
		return o1.getApellidoTitular().compareTo(o2.getApellidoTitular());
	}

	

	
	
	

}
