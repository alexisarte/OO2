package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public class LlamadaNacional extends Llamada {

	public LlamadaNacional(String emisor, String remitente, int duracion) {
		super(emisor, remitente, duracion);
	}

	@Override
	public double costo() {
		return this.duracion * 3 + (this.duracion * 3 * 0.21);
	}

}
