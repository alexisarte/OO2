package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public class PersonaFisica extends Persoona {

	private String dni;
	static double descuentoFis = 0;

	public PersonaFisica(String nombreYApellido, String telefono, Persoonal sistema, String dni) {
		super(nombreYApellido, telefono, sistema);
		this.dni = dni;
	}

	@Override
	public double getDescuento() {
		return descuentoFis;
	}

}
