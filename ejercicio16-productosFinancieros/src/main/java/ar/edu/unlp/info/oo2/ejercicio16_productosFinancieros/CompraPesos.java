package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

public class CompraPesos extends ProductoFinanciero {

	private double valorDeCambio;

	public CompraPesos(double valorDeCambio) {
		this.valorDeCambio = valorDeCambio;
	}

	@Override
	public double ganancia(double montoInicial) {
		return 0;
	}

}
