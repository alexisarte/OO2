package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;

public class SugerenciaNovedad extends Sugerencia {
	
    public SugerenciaNovedad(Decodificador deco) {
		super(deco);
	}
    
    @Override
	public List<Pelicula> sugerirPeliculas() {
    	return this.deco.getPeliculas().stream()
    			.filter(p -> !this.deco.getReproducidas().contains(p))
    			.sorted(Comparator.comparing(Pelicula::getAnioEstreno).reversed())
    			.limit(3).toList();
    }
    
}
