package ar.edu.unlp.info.oo2.ejercicio21_genealogiaSalvaje;

import java.time.LocalDate;

public class NullMamifero extends Mamifero {

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdentificador(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEspecie(String especie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDate getFechaNacimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getPadre() {
		// TODO Auto-generated method stub
		return new NullMamifero();
	}

	@Override
	public void setPadre(Mamifero padre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getMadre() {
		// TODO Auto-generated method stub
		return new NullMamifero();
	}

	@Override
	public void setMadre(Mamifero madre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getAbueloMaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean esAncestroMaterno(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esAncestroPaterno(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

}
