package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.Collections;
import java.util.List;

public class Pelicula {

	private String titulo;
	private Integer anioEstreno;
	private Integer puntaje;
	private List<Pelicula> similares;

	public Pelicula(String titulo, Integer anioEstreno, Integer puntaje, List<Pelicula> similares) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.similares = similares;
	}
	
	public void agregarSimilar(Pelicula peli) {
		if (!this.similares.contains(peli)) {
			this.similares.add(peli);
			peli.agregarSimilar(this);			
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAnioEstreno() {
		return anioEstreno;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public List<Pelicula> getSimilares() {
		return Collections.unmodifiableList(this.similares);
	}

}
