package ar.edu.unlam.pbii.grupo01;

import java.util.HashSet;
import java.util.Set;

import praticaTdd3.Cliente;

public class Empresa {

	private String nombre;
	private Set<Cliente>listaClientes;
	private Integer cantidadAbonados;

	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		this.listaClientes=new HashSet<Cliente>();
		this.cantidadAbonados=0;
	}

	public void agregarCliente(Cliente nuevo) {
		listaClientes.add(nuevo);
		cantidadAbonados++;
	}
	
	public Boolean habilitarPremium(Premium tipo, Cliente cliente)throws NoEsClienteConCableException {
		
		for(Cliente c: listaClientes){
			if(c instanceof ClienteCable){
				if(c.getId().equals(cliente)){
					return true;
				}
			}
		}
		throw new NoEsClienteConCableException ("No es un cliente con cable");
	}

	
	/**
	 * @return the cantidadAbonados
	 */
	public Integer getCantidadAbonados() {
		return cantidadAbonados;
	}


	/**
	 * @param cantidadAbonados the cantidadAbonados to set
	 */
	public void setCantidadAbonados(Integer cantidadAbonados) {
		this.cantidadAbonados = cantidadAbonados;
	}


	/**
	 * @return the listaClientes
	 */
	public Set<Cliente> getListaClientes() {
		return listaClientes;
	}


	/**
	 * @param listaClientes the listaClientes to set
	 */
	public void setListaClientes(Set<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
}
