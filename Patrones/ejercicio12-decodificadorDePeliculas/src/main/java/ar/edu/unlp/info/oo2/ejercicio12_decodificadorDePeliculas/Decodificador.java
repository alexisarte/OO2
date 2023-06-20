package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Decodificador {
	
    private List<Pelicula> peliculas, reproducidas;
    private Sugerencia criterioSugerencia;
    
    public Decodificador() {
		this.peliculas = new ArrayList<>();
		this.reproducidas = new ArrayList<>();
	}

	public void configurarDeco(Sugerencia criterioSugerencia) {
        this.criterioSugerencia = criterioSugerencia;
    }
    
    public List<Pelicula> obtenerSugerencias() {
        return criterioSugerencia.obtenerSugerencias();
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

	public void agregarPelicula(Pelicula peli) {
		this.peliculas.add(peli);
	}
    
}
