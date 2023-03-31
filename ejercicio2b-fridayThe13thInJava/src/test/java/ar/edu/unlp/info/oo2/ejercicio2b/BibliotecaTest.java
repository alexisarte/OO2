package ar.edu.unlp.info.oo2.ejercicio2b;

import static org.junit.jupiter.api.Assertions.*;


import org.json.simple.JSONArray;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class BibliotecaTest {
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	Biblioteca biblioteca;
	JSONArray json;

	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		biblioteca.setExporter(new JacksonExporter());
	}

	@Test
	void testAgregarSocio() {
		String resultado = this.biblioteca.exportarSocios();
		assertTrue(resultado.contains("Arya Stark") && resultado.contains("needle@stark.com")
				&& resultado.contains("5234-5"));
	}

	@Test
	void testExportarSocios() throws ParseException {
	    String textoSalida = "[\r\n"
	            + "    {\r\n"
	            + "        \"nombre\": \"Arya Stark\",\r\n"
	            + "        \"email\": \"needle@stark.com\",\r\n"
	            + "        \"legajo\": \"5234-5\"\r\n"
	            + "    },\r\n"
	            + "    {\r\n"
	            + "        \"nombre\": \"Tyron Lannister\",\r\n"
	            + "        \"email\": \"tyron@thelannisters.com\",\r\n"
	            + "        \"legajo\": \"2345-2\"\r\n"
	            + "    }\r\n"
	            + "]";
	    JSONParser parser = new JSONParser();
	    assertEquals(parser.parse(textoSalida), parser.parse(biblioteca.exportarSocios()));
	}

}
	