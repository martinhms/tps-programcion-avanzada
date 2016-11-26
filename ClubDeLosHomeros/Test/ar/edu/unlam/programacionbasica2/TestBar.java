package ar.edu.unlam.programacionbasica2;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")

public class TestBar {

	@Test
	public void BarAbiertoSinClientes()
	{
		Bar ClubDeHomer = new Bar();
		ClubDeHomer.abrirBar();
		Assert.assertTrue(ClubDeHomer.getClientes().size()==0);
	}
	

	@Test
	public void ClientesOrdenadosAlfabeticamente()
	{
		Bar ClubDeHomer= new Bar();
		ClubDeHomer.abrirBar();
		
		Cliente Marta = new Cliente("Marta",8);
		Cliente Carlos = new Cliente("Carlos",10);
		Cliente Santiago = new Cliente("Santiago",1);
		Cliente Alicia = new Cliente("Alicia",30);

		ClubDeHomer.agregarCliente(Marta);
		ClubDeHomer.agregarCliente(Carlos);
		ClubDeHomer.agregarCliente(Santiago);
		ClubDeHomer.agregarCliente(Alicia);
		
		//Ordena los clientes por Nombre
		Assert.assertTrue(ClubDeHomer.getClientes().first().getNombre()=="Carlos");
		Assert.assertTrue(ClubDeHomer.getClientes().last().getNombre()=="Alicia");
		
	}
	@Test
	public void ClientesOrdenadosPorEdad()
	{
		Bar ClubDeHomer= new Bar(new ComparadorDeClientes());
		ClubDeHomer.abrirBar();
		
		Cliente Marta = new Cliente("Marta",8);
		Cliente Carlos = new Cliente("Carlos",10);
		Cliente Santiago = new Cliente("Santiago",1);
		Cliente Marge = new Cliente("Alicia",30);

		ClubDeHomer.agregarCliente(Marta);
		ClubDeHomer.agregarCliente(Carlos);
		ClubDeHomer.agregarCliente(Santiago);
		ClubDeHomer.agregarCliente(Marge);
		
		//Ordena los clientes por Edad
		Assert.assertTrue(ClubDeHomer.getClientes().first().getEdad()==30);
		Assert.assertTrue(ClubDeHomer.getClientes().last().getEdad()==1);
	}
	@Test
	public void BarNoAdmiteClientesConElMismoNombre()
	{
		Bar ClubDeHomer= new Bar();
		ClubDeHomer.abrirBar();
		
		Cliente Homer = new Cliente("Homer",32);
		Cliente OtherHomer = new Cliente("Homer",32);

		ClubDeHomer.agregarCliente(Homer);
		ClubDeHomer.agregarCliente(OtherHomer);
		//Solo se Acepta un cliente con el mismo nombre
		Assert.assertTrue(ClubDeHomer.getClientes().size()==1);
	}
	@Test
	public void compararUnClienteDentroDelBarPorUnoDeAfuera()
	{
		Bar ClubDeHomer= new Bar();
		ClubDeHomer.abrirBar();
		
		Cliente Talo = new Cliente("Talo",32); 
		Cliente Martin = new Cliente("Martin",32); 
		
		ClubDeHomer.agregarCliente(Talo);
		//Cliente ClienteDentroDelBar = ClubDeHomer.getClientes().first();
		
		Assert.assertTrue(ClubDeHomer.getClientes().first().compareTo(Martin)!=0);
		
	}
}
