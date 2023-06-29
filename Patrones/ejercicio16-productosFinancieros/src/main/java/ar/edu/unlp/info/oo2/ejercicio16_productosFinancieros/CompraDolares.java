package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

public class CompraDolares extends ProductoFinanciero {
	
	private double valorCompra;
	
	public CompraDolares(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	@Override
	public double ganancia(double montoInicial) {
		return 0;
	}

}