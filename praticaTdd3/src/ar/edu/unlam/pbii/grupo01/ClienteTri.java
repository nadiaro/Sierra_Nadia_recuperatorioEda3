package ar.edu.unlam.pbii.grupo01;

import praticaTdd3.Cliente;

public class ClienteTri extends Cliente{

	private String codigoDeArea;
	private String telefono;
	private String codigoDecodificador;
	private String EMail;
	
	
	public ClienteTri(Integer id, String nombre, String codigoDeArea, String telefono, String codigoDecodificador, String EMail ) {
		super(id, nombre);
		this.codigoDeArea=codigoDeArea;
		this.telefono=telefono;
		this.codigoDecodificador=codigoDecodificador;
		this.EMail=EMail;
	
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
	 * @return the codigoDecodificador
	 */
	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}


	/**
	 * @param codigoDecodificador the codigoDecodificador to set
	 */
	public void setCodigoDecodificador(String codigoDecodificador) {
		this.codigoDecodificador = codigoDecodificador;
	}


	/**
	 * @return the eMail
	 */
	public String getEMail() {
		return EMail;
	}


	/**
	 * @param eMail the eMail to set
	 */
	public void setEMail(String eMail) {
		EMail = eMail;
	}
	
	
	

}
