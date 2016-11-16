package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testMontacargas {


	private Montacarga miMontacargas;
	
	@Before
	public void init()
	{
		miMontacargas = new Montacarga();
		TreeSet cargas = new TreeSet<Montacarga>();
		miMontacargas.setCargas(cargas);
	}
	
	@Test
	public void testCrearMontacargasVacio()
	{
	
		Assert.assertTrue(0 == miMontacargas.obtenerCantidadDeCargas());
	}

	@Test
	public void testIngresaCarga()
	{
		miMontacargas.ingresarCarga(new Carga(200));
	}	
	
	
}
