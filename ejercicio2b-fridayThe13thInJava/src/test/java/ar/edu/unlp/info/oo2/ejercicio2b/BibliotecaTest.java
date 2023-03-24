package ar.edu.unlp.info.oo2.ejercicio2b;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliotecaTest {

	Biblioteca biblioteca;
	Socio socio1, socio2;

	@BeforeEach
	void setUp() throws Exception {
		this.biblioteca = new Biblioteca();
		this.socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		this.socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
		this.biblioteca.agregarSocio(socio1);
		this.biblioteca.agregarSocio(socio2);
	}

	@Test
	void testAgregarSocio() {
		String resultado = this.biblioteca.exportarSocios();
		assertTrue(resultado.contains("Arya Stark") && resultado.contains("needle@stark.com")
				&& resultado.contains("5234-5"));
	}

	@Test
	void testExportarSocios() {
		assertEquals(this.biblioteca.exportarSocios(),
				"[\r\n" + "	{\r\n" + "		\"nombre\": \"Arya Stark\",\r\n"
						+ "		\"email\": \"needle@stark.com\",\r\n" + "		\"legajo\": \"5234-5\"\r\n" + "	},\r\n"
						+ "	{\r\n" + "		\"nombre\": \"Tyron Lannister\",\r\n"
						+ "		\"email\": \"tyron@thelannisters.com\",\r\n" + "		\"legajo\": \"2345-2\"\r\n"
						+ "	}\r\n" + "]");
	}

}
