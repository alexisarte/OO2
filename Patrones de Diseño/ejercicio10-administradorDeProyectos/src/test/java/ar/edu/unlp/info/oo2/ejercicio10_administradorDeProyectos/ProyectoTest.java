package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTest {

	Proyecto proyecto;

	@BeforeEach
	void setUp() throws Exception {
		proyecto = new Proyecto("Vacaciones de invierno", LocalDate.now(), LocalDate.now().plusDays(7),
				"salir con amigos", 3, 10000);
	}

	@Test
	void testAprobarEtapa() {
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getState() instanceof EnEvaluacion);
	}

	@Test
	void testCostoProyecto() {
		assertEquals(210000, this.proyecto.costoProyecto());
	}

	@Test
	void testPrecioProyecto() {
		assertEquals(14700, this.proyecto.precioProyecto());
	}

	@Test
	void testModificarGanancia() {
		
	}

	@Test
	void testCancelarProyecto() {
		
	}

}
