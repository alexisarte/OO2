package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public abstract class Llamada {

	private String emisor;
	private String remitente;
	protected int duracion;

	public Llamada() {

	}

	public Llamada(String emisor, String remitente, int duracion) {
		this.emisor = emisor;
		this.remitente = remitente;
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public abstract double costo();

}
