package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public class PersonaFisica extends Persona {

	private String dni;
	private static double descuentoFis = 0;

	public PersonaFisica(String nombreYApellido, String telefono, String dni) {
		super(nombreYApellido, telefono);
		this.dni = dni;
	}
	
	@Override
	public double getDescuento() {
		return descuentoFis;
	}

}
