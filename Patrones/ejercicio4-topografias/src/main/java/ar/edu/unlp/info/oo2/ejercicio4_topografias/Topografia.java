package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public abstract class Topografia {
	
	abstract double proporcionDeAgua();
	
	abstract double proporcionDeTierra();
	
	abstract boolean esIgualA(Topografia otraTopografia);

	abstract boolean esIgualACompuesta(Topografia otraTopografia);
	
	@Override
	public boolean equals(Object otraTopografia) {
		if (otraTopografia instanceof Topografia) {
			return this.esIgualA((Topografia) otraTopografia);
		}
		return false;
	}
	
}
