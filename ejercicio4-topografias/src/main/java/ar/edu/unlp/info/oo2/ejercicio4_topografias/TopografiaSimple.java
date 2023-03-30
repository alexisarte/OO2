package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public abstract class TopografiaSimple implements Topografia {

	@Override
	abstract public double proporcionDeAgua();

	@Override
	abstract public double proporcionDeTierra();

	@Override
	public boolean esIgualACompuesta(Topografia otraTopografia) {
		return false;
	}
	
	@Override
	public boolean equals(Object otraTopografia) {
		return this.proporcionDeAgua() == ((TopografiaSimple) otraTopografia).proporcionDeAgua();
	}
	
}
