package ar.edu.unlp.info.oo2.ejercicio4b_topografias;

public class Pantano extends TopografiaSimple {

	@Override
	public double proporcionDeAgua() {
		return 0.7;
	}

	@Override
	public double proporcionDeTierra() {
		return 0.3;
	}

}
