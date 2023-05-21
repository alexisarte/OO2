package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public class LlamadaNacional extends Llamada {

	public LlamadaNacional(String emisor, String receptor, int duracion) {
		super(emisor, receptor, duracion);
	}

	@Override
	public double costo() {
		return this.duracion * 3 + (this.duracion * 3 * 0.21);
	}

}
