package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

public class ExcursionProvisoria extends ExcursionState {
	
	public ExcursionProvisoria(Excursion context) {
		super(context);
	}
	
	private int calcularUsuariosFaltantes() {
		return this.context.getCupoMinimo() - this.context.getUsuarios().size();
	}
	
	@Override
	public void inscribir(Usuario unUsuario) {
		this.context.agregarUsuario(unUsuario);
		if (this.calcularUsuariosFaltantes() == 0) {
			this.context.setState(new ExcursionDefinitiva(this.context)); 
		}
	}
	
	@Override
	public String obtenerInformacion() { 
		return String.valueOf(this.calcularUsuariosFaltantes());
	}
	
}
