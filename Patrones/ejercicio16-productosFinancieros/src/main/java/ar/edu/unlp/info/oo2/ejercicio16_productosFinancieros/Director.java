package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

public class Director {
	
	public void construirPaqueteInversionDolarPeso(Builder builder) {
       builder.construirCompraDolares(400);
       builder.construirPlazoFijo(30, 50);
       builder.construirCompraPesos(500);
       builder.construirPlazoFijoRenovable(60, 80);
    }

}
	