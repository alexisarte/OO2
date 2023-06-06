package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

import java.util.stream.Collectors;

public class ExcursionDefinitiva extends ExcursionState {

	public ExcursionDefinitiva(Excursion context) {
		super(context);
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.context.agregarUsuario(unUsuario);
		if (this.calcularUsuariosFaltantes() == 0) {
			this.context.setState(new ExcursionEnListaDeEspera(this.context));
		}
	}

	@Override
	public String obtenerInformacion() {
		return String.join(String.valueOf(this.calcularUsuariosFaltantes()),
				this.context.getUsuarios().stream().map(Usuario::getEmail).collect(Collectors.toList()));
	}

	private int calcularUsuariosFaltantes() {
		return this.context.getCupoMaximo() - this.context.getUsuarios().size();
	}

}
