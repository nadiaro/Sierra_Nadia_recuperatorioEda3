package ejercicio.lista.banco;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Banco {

	private String nombre;

	private Set<Cuenta> listaCuentas;
	
	//lista cuentas por polimorfismo

	public Banco(String nombre) {
		this.nombre = nombre;
		this.listaCuentas=new HashSet<Cuenta>();

	}
	
	
	public void agregarCuenta(Cuenta nueva) {
		
		listaCuentas.add(nueva);
	}

	public Cuenta buscarCuentaPorId(Integer id) {
		
		for (Cuenta lista:listaCuentas) {
		
			if (lista.getId().equals(id))
				
				return lista;
		}
		return null;
	}

	public Boolean transferir(Integer idCuentaOrigen, Integer idCuentaDestino, Double monto)throws saldoInsuficienteException {

		if(monto>0){
			
		Cuenta cuentaOrigen=buscarCuentaPorId(idCuentaOrigen);
		Cuenta cuentaDestino=buscarCuentaPorId(idCuentaDestino);
		
		if(cuentaOrigen!=null && cuentaDestino!=null){
			
			cuentaOrigen.extraer(monto);
			cuentaDestino.depositar(monto);
			
			return true;
		}
		
	}
		
		throw new saldoInsuficienteException("la cuenta no tiene saldo");
}	
	
	
	public Boolean buscarCuentaConIterator(Integer id) throws cuentaNoExistenteException{
		Iterator<Cuenta> it=listaCuentas.iterator();
		while (it.hasNext()) {
		
			Cuenta cajaDeAhorro=it.next();
			if (cajaDeAhorro.getId().equals(id)) {
				return true;
			}
		}
		throw new cuentaNoExistenteException("la cuenta no existe");
		
	}
	
	
	public Boolean eliminarCuentaPorId(Integer id) throws cuentaNoExistenteException{
	
		Iterator<Cuenta> it =listaCuentas.iterator();
		while (it.hasNext()) {
			Cuenta cajaDeAhorro = it.next();
			if (cajaDeAhorro.getId().equals(id));
			it.remove();
			return true;
		}
		
		throw new cuentaNoExistenteException("la cuenta no existe");
		
	}
	
	public Set<Cuenta>listaOrdenada(Comparator<Cuenta>orden){
		Set<Cuenta>listaOrdenada=new TreeSet<>(orden);
		listaOrdenada.addAll(this.listaCuentas);
		return (TreeSet<Cuenta>)listaOrdenada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getListaCuentas() {
		return listaCuentas.size();
	}

	public void setListaCuentas(Set<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	
	
}
