package ar.edu.unlp.info.oo2.ejercicio21_genealogiaSalvaje;

import java.time.LocalDate;

public abstract class Mamifero {
	
	public abstract String getIdentificador();
	public abstract void setIdentificador(String id);
	public abstract String getEspecie();
	public abstract void setEspecie(String especie);
	public abstract LocalDate getFechaNacimiento();
	public abstract void setFechaNacimiento(LocalDate fecha);
	public abstract Mamifero getPadre();
	public abstract void setPadre(Mamifero padre);
	public abstract Mamifero getMadre();
	public abstract void setMadre(Mamifero madre);
	public abstract Mamifero getAbueloMaterno();
	public abstract Mamifero getAbuelaMaterna();
	public abstract Mamifero getAbueloPaterno();
	public abstract Mamifero getAbuelaPaterna();
	public abstract boolean esAncestroMaterno(Mamifero unMamifero);
	public abstract boolean esAncestroPaterno(Mamifero unMamifero);
	public abstract boolean tieneComoAncestroA(Mamifero unMamifero);
	
}
