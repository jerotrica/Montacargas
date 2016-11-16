package ar.edu.unlam.pb2;

import java.util.TreeSet;


public class Montacarga {

	private TreeSet<Carga> cargas;
	private Integer sumatoria;
	
	public Integer obtenerCantidadDeCargas()
	{
		return this.cargas.size();
	}
	
	public void sumatoriaDeCargas(Carga cargas)
	{
		Integer peso = 0;
		peso= cargas.getPeso();
		for (int i = 0; i < obtenerCantidadDeCargas(); i++) {
			sumatoria = sumatoria + peso;
		}
		
		this.setSumatoria(sumatoria);
	}
	
	public void ingresarCarga(Carga cargas)
	{
		this.cargas.add(cargas);
	}

	public TreeSet<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(TreeSet<Carga> cargas) {
		this.cargas = cargas;
	}

	public Integer getSumatoria() {
		return sumatoria;
	}

	public void setSumatoria(Integer sumatoria) {
		this.sumatoria = sumatoria;
	}

}
