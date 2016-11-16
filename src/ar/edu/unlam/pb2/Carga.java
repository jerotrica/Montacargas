package ar.edu.unlam.pb2;

public class Carga  {

	private Integer peso;
	
	public Carga(Integer peso) {
		this.peso= peso;
	}


	public Integer getPeso() {
		return peso;
	}



	public void setPeso(Integer peso) {
		this.peso = peso;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((peso == null) ? 0 : peso.hashCode());
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
		Carga other = (Carga) obj;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		return true;
	}
	
	
}
