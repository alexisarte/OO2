package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Persona {

	private String nombreYApellido;
	private String telefono;
	private ServcioTelefonico sistema;
	private List<Llamada> llamadas = new ArrayList<Llamada>();

	public Persona(String nombreYApellido, String telefono, ServcioTelefonico sistema) {
		this.nombreYApellido = nombreYApellido;
		this.telefono = telefono;
		this.sistema = sistema;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public ServcioTelefonico getSistema() {
		return sistema;
	}

	public List<Llamada> getLlamadas() {
		return Collections.unmodifiableList(this.llamadas);
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setSistema(ServcioTelefonico sistema) {
		this.sistema = sistema;
	}

	public void setLlamadas(List<Llamada> lista1) {
		this.llamadas = lista1;
	}

	public abstract double getDescuento();

	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}

}
