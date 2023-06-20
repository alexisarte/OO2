package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Pelicula {

	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> similares;

	public Pelicula(String titulo, double puntaje, int anioEstreno) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<>();
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

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public List<Pelicula> getSimilares() {
		return Collections.unmodifiableList(this.similares);
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(titulo, other.titulo);
	}

}
