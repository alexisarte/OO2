package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double cantIntegrantes;
	private double ganancia;
	private double pagoIntegrante;
	private ProyectoState state;

	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, double cantIntegrantes,
			double pagoIntegrante) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.cantIntegrantes = cantIntegrantes;
		this.ganancia = 7;
		this.pagoIntegrante = pagoIntegrante;
		this.state = new EnConstruccion(this);
	}

	public void aprobarEtapa() {
		this.state.aprobarEtapa();
	}

	public double costoProyecto() {
		return (this.cantIntegrantes * this.pagoIntegrante) * ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);
	}

	public double precioProyecto() {
		return (this.costoProyecto() * this.ganancia) / 100;
	}

	public void modificarGanancia(double ganancia) {
		this.state.modificarGanancia(ganancia);
	}

	public void cancelarProyecto() {
		this.state.cancelarProyecto();
	}

	public void setState(ProyectoState state) {
		this.state = state;
	}
	
	public void setGanancia(double nuevaGanancia) {
		this.ganancia = nuevaGanancia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}

	public LocalDate getFechaFin() {
		return this.fechaFin;
	}

	public String getObjetivo() {
		return this.objetivo;
	}

	public double getPagoIntegrante() {
		return this.pagoIntegrante;
	}

	public double getCantIntegrantes() {
		return this.cantIntegrantes;
	}

	public double getGanancia() {
		return this.ganancia;
	}

}