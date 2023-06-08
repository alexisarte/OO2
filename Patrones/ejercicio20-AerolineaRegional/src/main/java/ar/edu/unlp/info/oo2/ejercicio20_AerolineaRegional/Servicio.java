package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

public class Servicio {

	private int nroAsiento;
	private Vuelo vuelo;
	
	public void liberarAsiento() {
		this.vuelo.liberarAsiento();
	}

	public int getNroAsiento() {
		return nroAsiento;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

}
