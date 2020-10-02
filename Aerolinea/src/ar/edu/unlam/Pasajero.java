package ar.edu.unlam;

public class Pasajero {
	
		private Integer dni;
		private String nombre;
		private String apellido;
		
		public Pasajero(Integer dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		}
		
		public String getApellido() {
		return apellido;
		}
		
		public void setApellido(String apellido) {
		this.apellido = apellido;
		}
		
		public Integer getDni() {
		return dni;
		}
		
		public void setDni(int dni) {
		this.dni = dni;
		}
		
		public String getNombre() {
		return nombre;
		}
		
		public void setNombre(String nombre) {
		this.nombre = nombre;
		}
		
		public String toString() {
		return "Pasajero [dni=" + dni + ", nombre=" + nombre + ", apellido=" +
		apellido + "]";
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + dni;
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
			Pasajero other = (Pasajero) obj;
			if (dni != other.dni)
				return false;
			return true;
		}
		
		
	}


