package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public class Personaje {

	private Armadura armadura;
	private Arma arma;

	public Personaje(Armadura armadura, Arma arma) {
		this.arma = arma;
		this.armadura = armadura;
	}

	public void atacarA(Personaje otroPersonaje) {

	}

	public Armadura getArmadura() {
		return this.armadura;
	}

	public Arma getArma() {
		return this.arma;
	}

	public void recibirAtaque(Personaje otroPersonaje) {
		this.armadura.recibirAtaque(otroPersonaje.getArma());
	}

	public void atacar(Personaje otroPersonaje) {
		if ((this.armadura.getVida() > 0) && (otroPersonaje.getArmadura().getVida() > 0)) {
			otroPersonaje.recibirAtaque(this);
		}
	}

}
