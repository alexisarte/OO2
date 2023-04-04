package ar.edu.unlp.info.oo2.ejercicio6_calculoDeSueldos;

public class EmpleadoDePlanta extends Empleado {

	private boolean estaCasado;
	private int cantidadDeHijos;
	private int antiguedad;

	public EmpleadoDePlanta(String nombre, String apellido, boolean estaCasado, int cantidadDeHijos,
			int antiguedad) {
		super(nombre, apellido);
		this.estaCasado = estaCasado;
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}

	@Override
	public double sueldoBasico() {
		return 50000;
	}

	@Override
	public double adicionales() {
		double monto = 0;
		monto += this.estaCasado ? 5000 : 0;
		return monto + (this.cantidadDeHijos * 2000) + (2000 * this.antiguedad);
	}

}
