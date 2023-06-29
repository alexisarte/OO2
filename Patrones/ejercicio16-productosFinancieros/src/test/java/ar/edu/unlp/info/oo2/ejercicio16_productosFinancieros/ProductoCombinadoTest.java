package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCombinadoTest {
	
	Builder productoBuilder;
	Director director;
	ProductoCombinado productoCombinado;

	@BeforeEach
	void setUp() throws Exception {
		this.productoCombinado = new ProductoCombinado();
		this.productoBuilder = new ProductoBuilder(this.productoCombinado);
		this.director = new Director();
		this.director.construirPaqueteInversionDolarPeso(this.productoBuilder);
	}

	@Test
	void testGanancia() {
		
	}

}
