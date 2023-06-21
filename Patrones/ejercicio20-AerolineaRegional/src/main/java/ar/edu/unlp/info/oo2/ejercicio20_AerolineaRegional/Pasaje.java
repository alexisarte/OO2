package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pasaje {

	private Pasajero viajero;
	private List<Servicio> servicios;
	private Map<String, Double> rateDiario;
	private double RateRoundtrip;

	public Pasaje(Pasajero viajero, List<Servicio> servicios) {
		this.viajero = viajero;
		this.servicios = servicios;

		this.rateDiario = new HashMap<>();

		rateDiario.put("L", 1.0);
		rateDiario.put("Ma", 1.01);
		rateDiario.put("Mi", 0.99);
		rateDiario.put("J", 0.95);
		rateDiario.put("V", 1.0);
		rateDiario.put("S", 1.01);
		rateDiario.put("D", 1.01);
	}

	public void liberarAsientos() {
		this.servicios.stream().forEach(s -> s.liberarAsiento());
	}

	public double costo() {
		return this.costoBase()
				* this.rateDiario
						.get(this.servicios.get(0).getVuelo().getDia().format(DateTimeFormatter.ofPattern("EEEE")))
				* this.rateRoundtrip();
	}

	private double rateRoundtrip() {
		return this.servicios.get(0).getVuelo().getTipo().getSalida() == this.servicios.get(this.servicios.size() - 1)
				.getVuelo().getTipo().getArriba() ? 0.95 : 1;
	}

	public double costoBase() {
		return this.servicios.get(0).getVuelo().getTipo().getCostoBase();
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

}
