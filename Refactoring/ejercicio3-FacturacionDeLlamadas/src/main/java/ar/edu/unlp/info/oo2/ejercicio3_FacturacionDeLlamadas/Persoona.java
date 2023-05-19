package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Persoona {

	private String nombreYApellido;
	private String telefono;
	private Persoonal sistema;
	private List<Llamada> llamadas;

	public Persoona(String nombreYApellido, String telefono, Persoonal sistema) {
		this.nombreYApellido = nombreYApellido;
		this.telefono = telefono;
		this.sistema = sistema;
		this.llamadas = new ArrayList<Llamada>();
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public Persoonal getSistema() {
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

	public void setSistema(Persoonal sistema) {
		this.sistema = sistema;
	}
	
	public void setLista1(List<Llamada> lista1) {
		this.llamadas = lista1;
	}

	public double getDescuento() {
		return 0;
	}

}
