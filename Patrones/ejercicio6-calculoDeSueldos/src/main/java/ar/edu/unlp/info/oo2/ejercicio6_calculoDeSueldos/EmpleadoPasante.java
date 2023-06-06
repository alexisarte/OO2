package ar.edu.unlp.info.oo2.ejercicio6_calculoDeSueldos;

public class EmpleadoPasante extends Empleado {
	
	private int examenesRendidos;

	public EmpleadoPasante(String nombre, String apellido, int examenesRendidos) {
		super(nombre, apellido);
		this.examenesRendidos = examenesRendidos;
	}

	@Override
	public double sueldoBasico() {
		return 20000;
	}

	@Override
	public double adicionales() {
		return 2000 * this.examenesRendidos;
	}

}
