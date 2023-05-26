package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Persona {

	private List<Llamada> llamadas;
	private String nombreYApellido;
	private String telefono;

	public Persona(String nombreYApellido, String telefono) {
		this.llamadas = new ArrayList<>();
		this.nombreYApellido = nombreYApellido;
		this.telefono = telefono;
	}

	public List<Llamada> getLlamadas() {
		return Collections.unmodifiableList(this.llamadas);
	}

	public void setLlamadas(List<Llamada> lista1) {
		this.llamadas = lista1;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nya) {
		this.nombreYApellido = nya;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String tel) {
		this.telefono = tel;
	}

	public abstract double getDescuento();

	public double calcularMontoTotalLlamadas() {
		return this.llamadas
					.stream()
					.mapToDouble(llamada -> {
								double costo = llamada.calcularCosto();
								return costo - costo * this.getDescuento();
					})
					.reduce(0, Double::sum);
	}

	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}

}
