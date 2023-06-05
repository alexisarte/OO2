package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCombinadoTest {
	
	Builder b;
	ProductoCombinado p;

	@BeforeEach
	void setUp() throws Exception {
		p = new ProductoCombinado();
		b = new ProductoBuilder(p);
		
		b.construirCompraDolares(0);
		b.construirCompraPesos(0);
		
		p = b.getProductoCombinado();
	}

	@Test
	void testGanancia() {
		fail("Not yet implemented");
	}

}
