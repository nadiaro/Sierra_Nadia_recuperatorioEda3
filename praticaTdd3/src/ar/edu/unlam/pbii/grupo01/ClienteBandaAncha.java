package ar.edu.unlam.pbii.grupo01;

import praticaTdd3.Cliente;

public class ClienteBandaAncha extends Cliente{
	
	private String EMail;

	public ClienteBandaAncha(Integer id, String nombre, String EMail) {
		super(id, nombre);
		this.EMail=EMail;
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
	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	
}
