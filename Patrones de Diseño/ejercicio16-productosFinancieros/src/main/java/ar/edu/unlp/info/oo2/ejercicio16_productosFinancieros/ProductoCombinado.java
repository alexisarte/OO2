package ar.edu.unlp.info.oo2.ejercicio16_productosFinancieros;

import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado extends ProductoFinanciero {

	private List<ProductoFinanciero> productos;

	public ProductoCombinado() {
		this.productos = new ArrayList<>();
	}

	public void agregarProducto(ProductoFinanciero producto) {
		this.productos.add(producto);
    }
	
	@Override
    public double ganancia(double montoInicial) {
        return 0;
    }

}
