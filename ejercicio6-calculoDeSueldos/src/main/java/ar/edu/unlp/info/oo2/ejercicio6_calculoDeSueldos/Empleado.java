package ar.edu.unlp.info.oo2.ejercicio6_calculoDeSueldos;

public abstract class Empleado {

	private String nombre;
	private String apellido;

	public Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public abstract double sueldoBasico();
	public abstract double adicionales();
	
	public double descuentos() {
		return (0.13 * this.sueldoBasico()	) + (0.5 * this.adicionales()); 
	}
	
	public double sueldo() {
		return (this.sueldoBasico() + this.adicionales()) - this.descuentos();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	/**
	 * Retorna el nombre completo del empleado de la forma apellido, nombre
	 * 
	 * @return
	 */
	public String getNombreCompleto() {
		return this.getApellido() + ", " + this.getNombre();
	}

}
