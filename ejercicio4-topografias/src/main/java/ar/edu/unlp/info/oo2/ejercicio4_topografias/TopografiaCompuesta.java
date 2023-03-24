package ar.edu.unlp.info.oo2.ejercicio4_topografias;

import java.util.ArrayList;
import java.util.List;

public class TopografiaCompuesta implements ComponenteTopografia {

	private List<ComponenteTopografia> componentes = new ArrayList<>();;

	public TopografiaCompuesta(List<ComponenteTopografia> componentes) {
		this.componentes = componentes;
	}

	@Override
	public int proporcionDeAgua() {
		return this.componentes.stream().mapToInt(ComponenteTopografia::proporcionDeAgua).sum() / 4;
	}

	@Override
	public int proporcionDeTierra() {
		return this.componentes.stream().mapToInt(ComponenteTopografia::proporcionDeTierra).sum() / 4;
	}

}
