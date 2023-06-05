package ar.edu.unlp.info.oo2.ejercicio6_calculoDeSueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTest {
	
	Empleado empleado;

	@BeforeEach
	void setUp() throws Exception {	
		empleado = new EmpleadoTemporario("Pancracio", "Mbappe", 2, true, 2);
	}

	@Test
	void testSueldoBasico() {
		assertEquals(20600, empleado.sueldoBasico());
	}

	@Test
	void testAdicionales() {
		assertEquals(9000, empleado.adicionales());
	}
	
	@Test
	void testDescuentos() {
		assertEquals(7178, empleado.descuentos());
	}
	
	@Test
	void sueldo() {
		assertEquals(22422, empleado.sueldo());
	}
	
}
