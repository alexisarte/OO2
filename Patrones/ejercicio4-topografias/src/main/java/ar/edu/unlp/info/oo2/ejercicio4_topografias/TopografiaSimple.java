package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public abstract class TopografiaSimple extends Topografia {

	@Override
	public boolean esIgualACompuesta(Topografia otraTopografia) {
		return false;
	}
	
	@Override
	public boolean esIgualA(Topografia otraTopografia) {
		return this.proporcionDeAgua() == otraTopografia.proporcionDeAgua();
	}
	
}
