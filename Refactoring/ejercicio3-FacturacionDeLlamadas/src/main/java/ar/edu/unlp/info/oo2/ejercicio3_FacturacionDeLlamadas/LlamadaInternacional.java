package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public class LlamadaInternacional extends Llamada {

    public LlamadaInternacional(String emisor, String receptor, int duracion) {
        super(emisor, receptor, duracion);
    }

    @Override
    public double costo() {
        return this.duracion * 200 + (this.duracion * 200 * 0.21);
    }

}
