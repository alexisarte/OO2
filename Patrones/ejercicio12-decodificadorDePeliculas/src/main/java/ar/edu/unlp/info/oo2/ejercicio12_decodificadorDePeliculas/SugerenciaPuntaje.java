package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;

public class SugerenciaPuntaje extends Sugerencia {

	public SugerenciaPuntaje(Decodificador deco) {
		super(deco);
	}

	@Override
	public List<Pelicula> sugerirPeliculas() {
		return this.deco.getPeliculas().stream().sorted(Comparator.comparing(Pelicula::getPuntaje).reversed()
				.thenComparing(Pelicula::getAnioEstreno, Comparator.reverseOrder())).toList();
	}

}
