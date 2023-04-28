package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

public class PlazoFijo extends ProductoFinanciero {
	
	private int dias;
	private double interes;

	public PlazoFijo(int dias, double interes) {
		this.dias = dias;
		this.interes = interes;
	}

	@Override
	public double ganancia(double montoInicial) {
		return this.dias * (0.01 * (this.interes * montoInicial));
	}

}
