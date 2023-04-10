package ar.edu.unlp.info.oo2.ejercicio5_fileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Directorio extends Archivo {

	private List<Archivo> componentes;
	private static final int TAMANO = 32;

	/**
	 * Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
	 */
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, TAMANO);
		this.componentes = new ArrayList<>();
	}

	/**
	 * Retorna el espacio total ocupado, incluyendo su contenido.
	 */
	@Override
	public int tamanoTotalOcupado() {
		return this.componentes.stream().mapToInt(a -> a.tamanoTotalOcupado()).sum() + getTamano();
	}

	/**
	 * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	 * filesystem contenido por directorio receptor
	 */
	public Archivo archivoMasGrande() {
		return this.componentes.stream()
	            .map(a -> a.archivoMasGrande())
	            .filter(Objects::nonNull)
	            .max(Comparator.comparing(Archivo::getTamano))
	            .orElse(null);
	}

	/**
	 * Retorna el archivo con fecha de creación más reciente en cualquier nivel del
	 * filesystem contenido por directorio receptor.
	 */
	public Archivo archivoMasNuevo() {
		if (this.componentes.isEmpty()) {
			return null;
		}
		return this.componentes.stream().map(a -> a.archivoMasNuevo()).max((Archivo c1, Archivo c2) -> c1.getFecha().compareTo(c2.getFecha()))
				.orElse(null);
	}
	
	public void agregar(Archivo archivo) {
		this.componentes.add(archivo);
	}

}
