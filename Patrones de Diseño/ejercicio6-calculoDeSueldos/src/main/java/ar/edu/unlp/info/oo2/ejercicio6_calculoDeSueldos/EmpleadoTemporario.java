package ar.edu.unlp.info.oo2.ejercicio6_calculoDeSueldos;

public class EmpleadoTemporario extends Empleado {
	
	private int horasDeTrabajo;
	private boolean estaCasado;
	private int cantidadDeHijos;
	
	public EmpleadoTemporario(String nombre, String apellido, int horasDeTrabajo, boolean estaCasado, int cantidadDeHijos) {
		super(nombre, apellido);
		this.horasDeTrabajo = horasDeTrabajo;
		this.estaCasado = estaCasado;
		this.cantidadDeHijos = cantidadDeHijos;
	}

	@Override
	public double sueldoBasico() {
		return 20000 + (this.horasDeTrabajo * 300);
	}

	@Override
	public double adicionales() {
		double monto = 0;
		monto += this.estaCasado ? 5000 : 0;
		return monto + (this.cantidadDeHijos * 2000);
	}

}
