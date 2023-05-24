package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public abstract class Llamada {

	private String telEmisor;
	private String telRemitente;
	protected int duracion;

	public Llamada() {

	}

	public Llamada(String emisor, String remitente, int duracion) {
		this.telEmisor = emisor;
		this.telRemitente = remitente;
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setTelEmisor(String emisor) {
		this.telEmisor = emisor;
	}

	public String getTelRemitente() {
		return telRemitente;
	}

	public void setTelRemitente(String remitente) {
		this.telRemitente = remitente;
	}

	public abstract double costo();

}
