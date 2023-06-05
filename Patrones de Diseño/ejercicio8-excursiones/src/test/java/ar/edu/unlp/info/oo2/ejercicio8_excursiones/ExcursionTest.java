package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExcursionTest {

	Excursion excursion;
	Usuario unUsuario;

	@BeforeEach
	void setUp() throws Exception {
		excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.now(), LocalDate.now(), "New York",
				1000.0, 1, 2);
		unUsuario = new Usuario("Isidoro", "Chuquipoma", "isidoro@gmail.coom");
		excursion.inscribir(new Usuario("Pancracio", "Chuquipoma", "isidoro@gmail.coom"));
		excursion.inscribir(new Usuario("Eusebio", "Chuquipoma", "isidoro@gmail.coom"));
	}

	@Test
	void testInscribir() {
		this.excursion.inscribir(unUsuario);
		assertTrue(this.excursion.getListaDeEspera().contains(unUsuario));
		assertFalse(this.excursion.getUsuarios().contains(unUsuario));
	}

	@Test
	void testObtenerInformacion() {
		assertEquals("Dos días en kayak bajando el Paraná" + 1000.0 + LocalDate.now() + LocalDate.now() + "New York",
				this.excursion.obtenerInformacion());
	}

}
