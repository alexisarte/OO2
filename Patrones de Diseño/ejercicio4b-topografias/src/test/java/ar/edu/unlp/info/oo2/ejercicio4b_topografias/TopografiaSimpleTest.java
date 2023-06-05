package ar.edu.unlp.info.oo2.ejercicio4b_topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaSimpleTest {
	
	TopografiaSimple agua, agua2, tierra, pantano;

	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		agua2 = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
	}

	@Test
	void testEquals() {
		assertTrue(agua.equals(agua2));
		assertFalse(agua.equals(tierra));
		assertFalse(tierra.equals(agua));
		assertFalse(pantano.equals(agua));
	}

}
