package ar.edu.unlp.info.oo2.ejercicio5_fileSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DirectorioTest {
	
	Archivo arch1, arch2;
	Directorio directorio;
	
	@BeforeEach
	void setUp() throws Exception {
		directorio = new Directorio("Directorio", LocalDate.now().minusDays(15));
		arch1 = new Archivo("Archivo 1", LocalDate.now().minusDays(7), 40);
		arch2 = new Archivo("Expediente x", LocalDate.now(), 8);
		directorio.agregarArchivo(arch1);
		directorio.agregarArchivo(arch2);
	}

	@Test
	void testTamanoTotalOcupado() {
		assertEquals(80, directorio.tamanoTotalOcupado());
	}

	@Test
	void testArchivoMasGrande() {
		assertEquals(40, directorio.archivoMasGrande().getTamano());
	}

	@Test
	void testArchivoMasNuevo() {
		assertEquals("Expediente x", directorio.archivoMasNuevo().getNombre());
	}

}
