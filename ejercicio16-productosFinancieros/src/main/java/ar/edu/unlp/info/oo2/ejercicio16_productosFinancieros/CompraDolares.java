package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

public class CompraDolares extends ProductoFinanciero {
	
	private double valorDeCambio;
	
	public CompraDolares(double valorDeCambio) {
		this.valorDeCambio = valorDeCambio;
	}

	@Override
	public double ganancia(double montoInicial) {
		return 0;
	}

}