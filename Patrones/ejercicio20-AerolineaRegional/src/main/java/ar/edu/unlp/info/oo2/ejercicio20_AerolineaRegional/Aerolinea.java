package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Aerolinea {

	private List<Aeronave> aeronaves;
	private List<Vuelo> vuelos;
	private List<Pasaje> pasajes;
	private RateDiario rate;

	public Pasaje emitirPasaje(Pasajero pasajero, List<Servicio> servicios) {
		Pasaje pasaje = new Pasaje(pasajero, servicios);
		this.pasajes.add(pasaje);
		return pasaje;
	}

	public Pasaje modificarPasaje(Pasaje pasaje, List<Servicio> servicios) {
		pasaje.setServicios(servicios);
		return pasaje;
	}

	public void cancelarPasaje(Pasaje pasaje) {
		pasaje.liberarAsientos();
		this.pasajes.remove(pasaje);
	}

	public double promedioOcupacionVuelo(String vuelo, LocalDate from, LocalDate to) {
		return this.vuelos.stream().filter(v -> v.getTipo().getVuelo().equals(vuelo)).mapToInt(v -> v.getCantOcupados())
				.average().orElse(0);
	}

	public double horasVoladasAvionPeriodo(Aeronave aeronave, LocalDate from, LocalDate to) {
		return aeronave.horasVoladasEnPeriodo(from, to);
	}

	public double horasVoladasAvion(Aeronave aeronave) {
		return aeronave.horasVoladas();
	}

	public double eficenciaTarifas() {
		return this.pasajes.stream().mapToDouble(p -> p.costo()).sum()
				/ this.pasajes.stream().mapToDouble(p -> p.costoBasico()).sum();
	}

}
