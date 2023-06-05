package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

public class ExcursionEnListaDeEspera extends ExcursionState {
	
	public ExcursionEnListaDeEspera(Excursion context) {
		super(context);
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.context.agregarUsuarioAListaEspera(unUsuario);
	}

	@Override
	public String obtenerInformacion() {
		return "";
	}
	
}
