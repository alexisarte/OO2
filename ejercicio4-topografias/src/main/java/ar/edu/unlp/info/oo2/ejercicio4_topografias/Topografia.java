package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public abstract class Topografia {
	
	abstract double proporcionDeAgua();
	
	abstract double proporcionDeTierra();
	
	abstract boolean esIgualACompuesta(Topografia otraTopografia);
	
	@Override
	public boolean equals(Object otraTopografia) {
		if (otraTopografia instanceof Topografia) {
			return this.equals((Topografia) otraTopografia);
		}
		return false;
	}
	
	public abstract boolean equals(Topografia t);

}
