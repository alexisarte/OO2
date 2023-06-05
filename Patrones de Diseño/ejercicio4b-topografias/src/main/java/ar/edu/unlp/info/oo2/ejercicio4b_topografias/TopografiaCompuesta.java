package ar.edu.unlp.info.oo2.ejercicio4b_topografias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TopografiaCompuesta extends Topografia {

	private List<Topografia> componentes = new ArrayList<>();;

	public TopografiaCompuesta(Topografia c1, Topografia c2, Topografia c3, Topografia c4) {
		this.componentes = Arrays.asList(c1, c2, c3, c4);
	}

	@Override
	public double proporcionDeAgua() {
		return this.componentes.stream().mapToDouble(Topografia::proporcionDeAgua).sum() / 4;
	}

	@Override
	public double proporcionDeTierra() {
		return this.componentes.stream().mapToDouble(Topografia::proporcionDeTierra).sum() / 4;
	}

	@Override
	public boolean esIgualACompuesta(Topografia otraTopografia) {
		return this.componentes.equals(((TopografiaCompuesta) otraTopografia).getComponentes());
	}
	
	@Override
	public boolean equals(Topografia otraTopografia) {
		return otraTopografia.esIgualACompuesta(this);
	}

	public List<Topografia> getComponentes() {
		return Collections.unmodifiableList(this.componentes);
	}

}
