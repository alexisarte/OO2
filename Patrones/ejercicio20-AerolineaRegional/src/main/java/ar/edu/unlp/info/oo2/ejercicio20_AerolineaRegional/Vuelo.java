package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

import java.time.LocalDate;

public class Vuelo {

	private LocalDate dia;
	private int cantOcupados;
	private TipoVuelo tipo;
	private Aeronave avion;

	public Vuelo(LocalDate dia, int cantOcupados, TipoVuelo tipo, Aeronave avion) {
		super();
		this.dia = dia;
		this.cantOcupados = cantOcupados;
		this.tipo = tipo;
		this.avion = avion;
	}

	public LocalDate getDia() {
		return dia;
	}

	public int getCantOcupados() {
		return cantOcupados;
	}

	public TipoVuelo getTipo() {
		return tipo;
	}

	public Aeronave getAvion() {
		return avion;
	}

	public boolean includesDate(LocalDate from, LocalDate to) {
		return this.dia.isAfter(from) && this.dia.isBefore(to) || this.dia.equals(from) || this.dia.equals(to);
	}

	public double getSalida() {
		return this.tipo.getArriba();
	}

	public double getArriba() {
		return this.tipo.getArriba();
	}

	public void liberarAsiento() {
		this.cantOcupados--;
	}

}
