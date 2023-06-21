package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

public class TipoVuelo {

	private String vuelo;
	private String frecuencia;
	private double salida;
	private double arriba;
	private double costoBase;

	public TipoVuelo(String vuelo, String frecuencia, double salida, double arriba, double costoBase) {
		this.vuelo = vuelo;
		this.frecuencia = frecuencia;
		this.salida = salida;
		this.arriba = arriba;
		this.costoBase = costoBase;
	}

	public String getVuelo() {
		return vuelo;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public double getSalida() {
		return salida;
	}

	public double getArriba() {
		return arriba;
	}

	public double getCostoBase() {
		return costoBase;
	}

}
