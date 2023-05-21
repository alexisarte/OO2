package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

public class PersonaJuridica extends Persoona {

	private String cuit;
	private static double descuentoJur = 0.15;

	public PersonaJuridica(String nombreYApellido, String telefono, Persoonal sistema, String cuit) {
		super(nombreYApellido, telefono, sistema);
		this.cuit = cuit;
	}

	@Override
	public double getDescuento() {
		return descuentoJur;
	}

}
