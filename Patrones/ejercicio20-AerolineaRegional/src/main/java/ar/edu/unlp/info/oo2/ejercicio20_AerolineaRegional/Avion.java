package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

import java.time.LocalDate;
import java.util.List;

public class Avion {

	private int cantAsientos;
	private List<Vuelo> vuelos;

	public Avion(int cantAsientos, List<Vuelo> vuelos) {
		super();
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
									.mapToDouble(v -> v.getArriba() - v.getSalida()).sum();
	}

	public double horasVoladas(LocalDate from, LocalDate to) {
		return this.vuelos.stream().mapToDouble(v -> v.getArriba() - v.getSalida()).sum();
	}

}
