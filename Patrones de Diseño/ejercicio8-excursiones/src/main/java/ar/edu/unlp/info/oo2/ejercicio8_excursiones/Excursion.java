package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Usuario> usuarios;
	private List<Usuario> listaDeEspera;
	private ExcursionState state;

	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, double costo,
			int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.state = new ExcursionProvisoria(this);
		this.usuarios = new ArrayList<>();
		this.listaDeEspera = new ArrayList<>();
	}

	public void inscribir(Usuario unUsuario) {
		this.state.inscribir(unUsuario);
	}

	public String obtenerInformacion() {
		return this.nombre + this.costo + this.fechaInicio + this.fechaFin + this.puntoDeEncuentro
				+ this.state.obtenerInformacion();
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setState(ExcursionState state) {
		this.state = state;
	}

	public void agregarUsuario(Usuario unUsuario) {
		this.usuarios.add(unUsuario);
	}

	public void agregarUsuarioAListaEspera(Usuario unUsuario) {
		this.listaDeEspera.add(unUsuario);
	}

	public List<Usuario> getListaDeEspera() {
		return listaDeEspera;
	}

}
