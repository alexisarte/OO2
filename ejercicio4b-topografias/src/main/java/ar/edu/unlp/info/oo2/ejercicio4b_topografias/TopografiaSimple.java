package ar.edu.unlp.info.oo2.ejercicio4b_topografias;

public abstract class TopografiaSimple extends Topografia {

	@Override
	abstract public double proporcionDeAgua();

	@Override
	abstract public double proporcionDeTierra();

	@Override
	public boolean esIgualACompuesta(Topografia otraTopografia) {
		return false;
	}
	
	@Override
	public boolean equals(Topografia otraTopografia) {
		return this.proporcionDeAgua() == otraTopografia.proporcionDeAgua();
	}
	
}
