package ar.edu.unlp.info.oo2.ejercicio21_genealogiaSalvaje;

import java.time.LocalDate;

public class RealMamifero extends Mamifero {

	private String identificador;
	private String especie;
	private Mamifero padre;
	private Mamifero madre;
	private LocalDate fechaNacimiento;

	public RealMamifero() {
		this.padre = new NullMamifero();
		this.madre = new NullMamifero();
	}

	public RealMamifero(String identificador) {
		this.identificador = identificador;
		this.padre = new NullMamifero();
		this.madre = new NullMamifero();
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return this.especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return this.padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return this.madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getAbueloMaterno() {
		return this.getMadre().getPadre();
	}

	public Mamifero getAbuelaMaterna() {
		return this.getMadre().getMadre();
	}

	public Mamifero getAbueloPaterno() {
		return this.getPadre().getPadre();
	}

	public Mamifero getAbuelaPaterna() {
		return this.getPadre().getMadre();
	}

	public boolean esAncestroMaterno(Mamifero unMamifero) {
		return this.getMadre().equals(unMamifero) || this.getMadre().tieneComoAncestroA(unMamifero);
	}

	public boolean esAncestroPaterno(Mamifero unMamifero) {
		return this.getPadre().equals(unMamifero) || this.getPadre().tieneComoAncestroA(unMamifero);
	}

	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return this.esAncestroMaterno(unMamifero) || this.esAncestroPaterno(unMamifero);
	}

}