package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.Collections;
import java.util.List;

public class Decodificador {
	
    private List<Pelicula> peliculas;
    private List<Pelicula> reproducidas;
    private Sugerencia criterioSugerencia;
    
    public void configurarDeco(Sugerencia criterioSugerencia) {
        this.criterioSugerencia = criterioSugerencia;
    }
    
    public List<Pelicula> sugerirPeliculas() {
        return criterioSugerencia.sugerirPeliculas();
    }

	public List<Pelicula> getPeliculas() {
		return Collections.unmodifiableList(this.peliculas);
	}
	
	public List<Pelicula> getReproducidas() {
		return Collections.unmodifiableList(this.reproducidas);
	}
	
	public void reproducir(Pelicula peli) {
		this.reproducidas.add(peli);
	}
    
}
