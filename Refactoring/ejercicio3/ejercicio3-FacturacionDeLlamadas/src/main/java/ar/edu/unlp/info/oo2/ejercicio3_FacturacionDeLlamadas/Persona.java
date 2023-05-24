package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Persona {

	private String nombreYApellido;
	private String telefono;
	private List<Llamada> llamadas = new ArrayList<Llamada>();

	public Persona(String nombreYApellido, String telefono, ServcioTelefonico sistema) {
		this.nombreYApellido = nombreYApellido;
		this.telefono = telefono;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public String getTelefono() {
		return telefono;
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

	public void setLlamadas(List<Llamada> lista1) {
		this.llamadas = lista1;
	}

	public abstract double getDescuento();

	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}

	public double calcularMontoLlamadas() {
		double monto = 0;
		for (Llamada llamada : this.llamadas) {
			double costoLlamada = 0;
			costoLlamada += llamada.costo();
			costoLlamada -= costoLlamada * this.getDescuento();
			monto += costoLlamada;
		}
		return monto;
	}

}
