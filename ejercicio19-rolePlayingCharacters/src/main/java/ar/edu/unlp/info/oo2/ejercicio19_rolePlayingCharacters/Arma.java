package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public abstract class Arma {

	public void decimeQuienSos(Armadura armadura) {
		armadura.recibirAtaqueDesconocido(this);
	}

}
