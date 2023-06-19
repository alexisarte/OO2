package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.List;

public abstract class Sugerencia {
	
	protected Decodificador deco;
	
	public Sugerencia(Decodificador deco) {
		this.deco = deco;
	}

	public abstract List<Pelicula> sugerirPeliculas();

}
