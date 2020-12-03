package ar.edu.unlam.pbii.grupo01;

import praticaTdd3.Cliente;

public class ClienteTelefonia extends Cliente{

	
	private String codigoDeArea;
	private String telefono;
	
	public ClienteTelefonia(Integer id, String nombre, String codigoDeArea,String telefono ) {
		super(id, nombre);
		this.telefono=telefono;
		this.codigoDeArea=codigoDeArea;
	}

	/**
	 * @return the codigoDeArea
	 */
	public String getCodigoDeArea() {
		return codigoDeArea;
	}

	/**
	 * @param codigoDeArea the codigoDeArea to set
	 */
	public void setCodigoDeArea(String codigoDeArea) {
		this.codigoDeArea = codigoDeArea;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
