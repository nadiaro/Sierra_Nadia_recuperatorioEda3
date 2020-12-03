package ar.edu.unlam.pbii.grupo01;

import praticaTdd3.Cliente;

public class ClienteCable extends Cliente {

	private String codigoDecodificador;
	
	public ClienteCable(Integer id, String nombre, String codigoDecodificador) {
		super(id, nombre);
		this.codigoDecodificador=codigoDecodificador;
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
	
	

}
