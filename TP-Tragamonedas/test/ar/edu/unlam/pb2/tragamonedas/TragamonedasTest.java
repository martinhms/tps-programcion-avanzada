package ar.edu.unlam.pb2.tragamonedas;

import org.junit.Assert;
import org.junit.Test;

public class TragamonedasTest {
	
	@Test
	public void queElTragamonedasGireAleatoriamente() throws Exception{
		Tambor miTambor1 = new Tambor(8);
		Tambor miTambor2 = new Tambor(8);
		Tambor miTambor3 = new Tambor(8);
		Tragamonedas miTragamonedas = new Tragamonedas(miTambor1, miTambor2, miTambor3);
		miTragamonedas.girarTambores();
		
		//Visualizaci�n del resultado			
		System.out.println(miTragamonedas.getResultado1());
		System.out.println(miTragamonedas.getResultado2());
		System.out.println(miTragamonedas.getResultado3());
		
		
		//Assert's si gan� (True) o si perdi� (False)
		Assert.assertTrue(miTragamonedas.finJuego());
		Assert.assertFalse(miTragamonedas.finJuego());
	}

}
