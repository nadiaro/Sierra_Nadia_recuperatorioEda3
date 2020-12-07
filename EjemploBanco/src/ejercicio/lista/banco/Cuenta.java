package ejercicio.lista.banco;

public abstract class Cuenta {

	private Integer id;
	private Double saldo;
	private Cliente cliente;

	public Cuenta(Integer id, Double saldo, Cliente cliente) {
		this.id=id;
		this.saldo=saldo;
		this.cliente=cliente;
	}

	public Cuenta(Integer id, Double saldo, Integer dni, String nombre, String apellido) {
		this.id=id;
		this.saldo=saldo;
		this.cliente=new  Cliente(dni, nombre, apellido);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public abstract void extraer(Double monto); 
//	{
//		
//		if (this.saldo>=monto&&monto>0.0)
//		this.saldo-=monto;
//		
//		
//	}

	public abstract void depositar(Double monto);
//	{
//		
//		this.saldo+=monto;
//		
//	
//	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cuenta [cliente=" + cliente + "]";
	}
	
	
}
