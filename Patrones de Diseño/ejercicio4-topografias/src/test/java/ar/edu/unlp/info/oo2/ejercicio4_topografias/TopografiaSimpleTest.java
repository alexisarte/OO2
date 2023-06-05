package ar.edu.unlp.info.oo2.ejercicio4_topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaSimpleTest {
	
	TopografiaSimple agua, agua2, tierra;

	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		agua2 = new Agua();
		tierra = new Tierra();
	}
	
	@Test
	void testProporcionDeAgua() {
		assertEquals(1, agua.proporcionDeAgua());
		assertEquals(0, tierra.proporcionDeAgua());
	}

	@Test
	void testProporcionDeTierra() {
		assertEquals(0, agua.proporcionDeTierra());
		assertEquals(1, tierra.proporcionDeTierra());
	}

	@Test
	void testEquals() {
		assertTrue(agua.equals(agua2));
		assertFalse(agua.equals(tierra));
		assertFalse(tierra.equals(agua));
	}

}
