package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

import java.time.LocalDate;
import java.util.List;

public class Aeronave {

	private int cantAsientos;
	private List<Vuelo> vuelos;

	public Aeronave(int cantAsientos, List<Vuelo> vuelos) {
		this.cantAsientos = cantAsientos;
		this.vuelos = vuelos;
	}

	public int getCantAsientos() {
		return cantAsientos;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public double horasVoladasEnPeriodo(LocalDate from, LocalDate to) {
		return this.vuelos.stream().filter(v -> v.includesDate(from, to))
				.mapToDouble(v -> v.getTipo().getArriba() - v.getTipo().getSalida()).sum();
	}

	public double horasVoladas() {
		return this.vuelos.stream().mapToDouble(v -> v.getTipo().getArriba() - v.getTipo().getSalida()).sum();
	}

}
