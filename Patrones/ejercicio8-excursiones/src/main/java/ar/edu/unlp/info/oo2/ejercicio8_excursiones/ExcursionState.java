package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

public abstract class ExcursionState {
	
	protected Excursion context;
	
	public ExcursionState(Excursion context) {
		this.context = context;
	}
	
	public void inscribir(Usuario unUsuario) {
	
	}

	public abstract String obtenerInformacion();
	
}
