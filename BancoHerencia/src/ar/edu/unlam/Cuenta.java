package ar.edu.unlam;

public abstract class Cuenta {
	
	private Integer id;
	private Double saldo;
	private Cliente cliente;
	
	
	public Cuenta(Integer id, Double saldo, Cliente cliente) {
		this.id = id;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public abstract void extraer(Double monto);
	
	public abstract void depositar(Double monto);

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	
}
