package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

public abstract class Builder {
	
	public abstract void construirCompraDolares(double valorDeCambio);

	public abstract void construirCompraPesos(double valorDeCambio);

	public abstract void construirPlazoFijo(int dias, double interes);

	public abstract void construirPlazoFijoRenovable(int dias, double interes);

	public abstract ProductoCombinado getProductoCombinado();

}
