package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Aerolinea {

	private List<Avion> aeronaves;
	private List<Vuelo> vuelos;
	private List<Pasaje> pasajes;
	private RateDiario rate;

	public Pasaje emitirPasaje(Pasajero pasajero, List<Servicio> servicios) {
		Pasaje pasaje = new Pasaje(pasajero, servicios);
		this.pasajes.add(pasaje);
		return pasaje;
	}

	public void modificarPasaje() {
		
	}

	public void cancelarPasaje(Pasaje pasaje) {
		pasaje.liberarAsientos();
		this.pasajes.remove(pasaje);
	}

	public double promediosDeOcupacionVuelos() {
		return this.vuelos.stream().mapToInt(Vuelo::getCantOcupados).sum() / this.vuelos.size();
	}

	public double horasVoladasAvionesEnPeriodo(LocalDate from, LocalDate to) {
		return this.aeronaves.stream().mapToDouble(a -> a.horasVoladasEnPeriodo(from, to)).sum();
	}

	public double horasVoladasAviones(LocalDate from, LocalDate to) {
		return this.aeronaves.stream().mapToDouble(a -> a.horasVoladas(from, to)).sum();
	}

}
