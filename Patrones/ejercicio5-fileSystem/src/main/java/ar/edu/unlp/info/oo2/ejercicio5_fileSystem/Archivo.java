package ar.edu.unlp.info.oo2.ejercicio5_fileSystem;

import java.time.LocalDate;

public class Archivo {

	private String nombre;
	private LocalDate fecha;
	private int tamano;

	/**
	 * Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano y en la fecha
	 * <fecha>.
	 */
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}

	public String getNombre() {
		return this.nombre;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public int getTamano() {
		return this.tamano;
	}
	
	public int tamanoTotalOcupado() {
		return this.getTamano();
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}

}
