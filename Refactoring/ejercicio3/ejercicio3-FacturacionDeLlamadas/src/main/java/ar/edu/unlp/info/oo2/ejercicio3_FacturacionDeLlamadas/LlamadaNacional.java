package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public class LlamadaNacional extends Llamada {
	
	private static final int impuestoNacional = 3;
	
	public LlamadaNacional(String emisor, String remitente, int duracion) {
		super(emisor, remitente, duracion);
	}

	@Override
	public double calcularCosto() {
		return this.duracion * impuestoNacional + (this.duracion * impuestoNacional * impuestoComun);
	}

}
