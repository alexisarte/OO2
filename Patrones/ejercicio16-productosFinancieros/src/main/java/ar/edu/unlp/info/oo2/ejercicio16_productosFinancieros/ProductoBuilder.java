package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

public class ProductoBuilder implements Builder {
	
	private ProductoCombinado producto;
	
	public ProductoBuilder(ProductoCombinado producto) {
		this.producto = producto;
	}

	@Override
	public void construirCompraDolares(double valorDeCambio) {
		this.producto.agregarProducto(new CompraDolares(valorDeCambio));
	}

	@Override
	public void construirCompraPesos(double valorDeCambio) {
		this.producto.agregarProducto(new CompraPesos(valorDeCambio));
	}

	@Override
	public void construirPlazoFijo(int dias, double interes) {
		this.producto.agregarProducto(new PlazoFijo(dias, interes));
	}

	@Override
	public void construirPlazoFijoRenovable(int dias, double interes) {
		this.producto.agregarProducto(new PlazoFijoRenovable(dias, interes));
	}
	
	@Override
	public ProductoCombinado getProductoCombinado() {
		return this.producto;
	}

}
