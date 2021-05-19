package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component 
	public class Provincia {
	private int codigoProvincia;
	private String nombreProvincia;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(int codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoProvincia;
		result = prime * result + ((nombreProvincia == null) ? 0 : nombreProvincia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		if (codigoProvincia != other.codigoProvincia)
			return false;
		if (nombreProvincia == null) {
			if (other.nombreProvincia != null)
				return false;
		} else if (!nombreProvincia.equals(other.nombreProvincia))
			return false;
		return true;
	}

	public Provincia(int codigoProvincia, String nombreProvincia) {
		super();
		this.codigoProvincia = codigoProvincia;
		this.nombreProvincia = nombreProvincia;
	}
	
	
}
