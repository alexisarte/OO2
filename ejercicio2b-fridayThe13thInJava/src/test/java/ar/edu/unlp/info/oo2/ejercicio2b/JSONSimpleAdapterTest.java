package ar.edu.unlp.info.oo2.ejercicio2b;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class JSONSimpleAdapterTest {

	@Test
	void testExportar() {
		JSONSimpleAdapter json = new JSONSimpleAdapter();
		Socio socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		List<Socio> socios = new ArrayList<>();
		socios.add(socio1);

		String resultado = json.exportar(socios);

		assertTrue(resultado.contains(socio1.getNombre()) && resultado.contains(socio1.getEmail())
				&& resultado.contains(socio1.getLegajo()));
	}

}
