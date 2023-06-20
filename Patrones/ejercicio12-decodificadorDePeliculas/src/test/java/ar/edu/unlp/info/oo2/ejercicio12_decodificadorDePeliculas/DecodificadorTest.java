package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {

	private Decodificador deco;
	private Pelicula peli1, peli2, peli3, peli4, peli5, peli6;
	
	@BeforeEach
	void setUp() {
		this.peli1 = new Pelicula("Thor", 7.9, 2007);
		this.peli2 = new Pelicula("Capitan America", 7.8, 2016);
		this.peli3 = new Pelicula("Iron man", 7.9, 2010);
		this.peli4 = new Pelicula("Dunkirk", 7.9, 2017);
		this.peli5 = new Pelicula("Rocky", 8.1, 1976);
		this.peli6 = new Pelicula("Rambo", 7.8, 1979);
		this.peli1.agregarSimilar(peli2);
		this.peli1.agregarSimilar(peli3);
		this.peli2.agregarSimilar(peli3);
		this.peli5.agregarSimilar(peli6);
		
		this.deco = new Decodificador();
		
		this.deco.agregarPelicula(peli1);
		this.deco.agregarPelicula(peli2);
		this.deco.agregarPelicula(peli3);
		this.deco.agregarPelicula(peli4);
		this.deco.agregarPelicula(peli5);
		this.deco.agregarPelicula(peli6);
		
		this.deco.reproducir(peli1);
		this.deco.reproducir(peli5);
	}
	
	@Test
	public void testSugerenciaPorNovedad() {
		this.deco.configurarDeco(new SugerenciaNovedad(this.deco));
		assertEquals(Arrays.asList(peli4, peli2, peli3), this.deco.obtenerSugerencias());
	}

	@Test
	public void testSugerenciaPorSimilaridad() {
		this.deco.configurarDeco(new SugerenciaSimilaridad(this.deco));
		assertEquals(Arrays.asList(peli2, peli3, peli6), this.deco.obtenerSugerencias());
	}
	
	@Test
	public void testSugerenciaPorPuntaje() {
		this.deco.configurarDeco(new SugerenciaPuntaje(this.deco));
		assertEquals(Arrays.asList(peli4, peli3, peli2), this.deco.obtenerSugerencias());
	}

}
