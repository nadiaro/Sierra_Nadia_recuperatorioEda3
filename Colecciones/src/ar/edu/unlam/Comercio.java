package ar.edu.unlam;

import java.util.ArrayList;

public class Comercio {
	
	private String nombre;
	private ArrayList<Producto>listaProductos;

	
	public Comercio(String nombre) {
		this.nombre=nombre;
		this.listaProductos=new ArrayList<Producto>();
		
	}


	public Boolean agregarProductoAcomercio(Producto producto) {

		this.listaProductos.add(producto);
		return true;
	}


	public Producto buscarProductoPorCodigo(String codigo) {
		
		for(Producto producto: listaProductos){
			if(producto.getCodigo().equals(codigo)){
				return producto;
			}
		}
		return null;
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


	/**
	 * @return the listaProductos
	 */
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}


	/**
	 * @param listaProductos the listaProductos to set
	 */
	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	

}
