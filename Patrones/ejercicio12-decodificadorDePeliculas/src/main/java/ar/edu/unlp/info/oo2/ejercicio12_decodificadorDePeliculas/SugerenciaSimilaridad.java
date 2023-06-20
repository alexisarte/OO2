package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;

public class SugerenciaSimilaridad extends Sugerencia {

	public SugerenciaSimilaridad(Decodificador deco) {
		super(deco);
	}

	@Override
	public List<Pelicula> sugerirPeliculas() {
		return this.deco.getReproducidas().stream().flatMap(p -> p.getSimilares().stream()).distinct()
				.sorted(Comparator.comparing(Pelicula::getAnioEstreno).reversed()).toList();
	}

}
