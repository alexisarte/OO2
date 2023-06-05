package ar.edu.unlp.info.oo2.ejercicio6_calculoDeSueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoDePlantaTest {

	Empleado empleado;

	@BeforeEach
	void setUp() throws Exception {	
		empleado = new EmpleadoDePlanta("Pancracio", "Mbappe", true, 2, 5);
	}

	@Test
	void testSueldoBasico() {
		assertEquals(50000, empleado.sueldoBasico());
	}

	@Test
	void testAdicionales() {
		assertEquals(19000, empleado.adicionales());
	}

	@Test
	void testDescuentos() {
		assertEquals(16000, empleado.descuentos());
	}

	@Test
	void testSueldo() {
		assertEquals(53000, empleado.sueldo());
	}

}
