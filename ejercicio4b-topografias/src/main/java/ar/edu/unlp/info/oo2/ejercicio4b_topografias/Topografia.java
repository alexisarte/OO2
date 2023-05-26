package ar.edu.unlp.info.oo2.ejercicio4b_topografias;

public abstract class Topografia {
	
	public abstract double proporcionDeAgua();
	
	public abstract double proporcionDeTierra();
	
	public abstract boolean esIgualACompuesta(Topografia otraTopografia);
	
	public abstract boolean equals(Topografia otraTopografia);
	
	@Override
	public boolean equals(Object otraTopografia) {
		if (otraTopografia instanceof Topografia) {
			return this.equals((Topografia) otraTopografia);
		}
		return false;
	}

}
