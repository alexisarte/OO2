package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public class LlamadaInternacional extends Llamada {
	
	private static final int impuestoInternacional = 200;

    public LlamadaInternacional(String emisor, String remitente, int duracion) {
        super(emisor, remitente, duracion);
    }

    @Override
    public double calcularCosto() {
        return this.duracion * impuestoInternacional + (this.duracion * impuestoInternacional * impuestoComun);
    }

}
