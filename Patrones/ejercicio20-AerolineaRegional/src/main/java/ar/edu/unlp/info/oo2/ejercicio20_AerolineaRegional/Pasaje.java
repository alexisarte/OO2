package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

import java.util.List;

public class Pasaje {
	
	private Pasajero viajero;
	private List<Servicio> servicios;
	
	public Pasaje(Pasajero viajero, List<Servicio> servicios) {
		super();
		this.viajero = viajero;
		this.servicios = servicios;
	}

	public void liberarAsientos() {
		this.servicios.stream().forEach(s -> s.liberarAsiento());
	}
	
	
	
}
