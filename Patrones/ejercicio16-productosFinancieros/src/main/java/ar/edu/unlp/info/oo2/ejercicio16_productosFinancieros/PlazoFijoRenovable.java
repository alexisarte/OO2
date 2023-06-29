package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

public class PlazoFijoRenovable extends ProductoFinanciero {
	
	private int dias;
	private double interes;

	public PlazoFijoRenovable(int dias, double interes) {
		this.dias = dias;
		this.interes = interes;
	}

	@Override
	public double ganancia(double montoInicial) {
		return this.dias * (0.01 * (this.interes * montoInicial));
	}

}
