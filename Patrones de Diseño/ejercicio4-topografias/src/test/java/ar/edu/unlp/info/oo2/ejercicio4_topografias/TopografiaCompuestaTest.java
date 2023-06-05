package ar.edu.unlp.info.oo2.ejercicio4_topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaCompuestaTest {

	TopografiaCompuesta mixta, mixta2;
	
	@BeforeEach
	void setUp() throws Exception { 
		mixta = new TopografiaCompuesta(new Agua(), new Tierra(), new Tierra(),  new Agua());
		mixta2 = new TopografiaCompuesta(new Agua(), new Tierra(), new Tierra(), mixta);
	}

	@Test
	void testProporcionDeAgua() {
		assertEquals(0.5, mixta.proporcionDeAgua());
		assertEquals(0.375, mixta2.proporcionDeAgua());
	}

	@Test
	void testProporcionDeTierra() {
		assertEquals(0.5, mixta.proporcionDeTierra());
		assertEquals(0.625, mixta2.proporcionDeTierra());
	}

	@Test
	void testEquals() {
		assertTrue(mixta.equals(mixta));
		assertFalse(mixta2.equals(mixta));
		assertFalse(mixta.equals(mixta2));
	}

}
