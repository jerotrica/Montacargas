package ar.edu.unlam.pb2;

import java.util.Collection;
import java.util.TreeSet;


public class Montacarga {

	private TreeSet<Carga> cargas; 
	
	public Integer obtenerCantidadDePersonas()
	{
		return this.cargas.size();
	}
	
	public void admitirPersona(Carga cargas) throws Exception
	{
		if(!this.cargas.add(cargas))
		{
			throw new Exception("No se admiten " + cargas.getPeso());
		}
	}

	public TreeSet<Carga> getPersonas() {
		return cargas;
	}

	public void setPersonas(TreeSet<Carga> personas) {
		this.cargas = personas;
	}
}
