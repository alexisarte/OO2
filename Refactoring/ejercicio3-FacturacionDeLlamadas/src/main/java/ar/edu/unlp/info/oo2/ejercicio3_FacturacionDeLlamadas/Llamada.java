package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public abstract class Llamada {

	private String emisor;
	private String remitente;
	protected int duracion;

	public Llamada() {

	}

	public Llamada(String p, String p2, int duracion) {
		this.emisor = p;
		this.remitente = p2;
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setEmisor(String q) {
		emisor = q;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public abstract double costo();

}
