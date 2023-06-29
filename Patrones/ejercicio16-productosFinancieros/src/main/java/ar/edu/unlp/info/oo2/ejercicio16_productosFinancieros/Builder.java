package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

public interface Builder {
	
	void construirCompraDolares(double valorDeCambio);

	void construirCompraPesos(double valorDeCambio);

	void construirPlazoFijo(int dias, double interes);

	void construirPlazoFijoRenovable(int dias, double interes);

	ProductoCombinado getProductoCombinado();

}
