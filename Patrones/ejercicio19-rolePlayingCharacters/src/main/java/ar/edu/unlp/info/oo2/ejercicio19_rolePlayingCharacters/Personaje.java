package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public class Personaje {

	private Armadura armadura;
	private Arma arma;
	private int vida;

	public Personaje(Armadura armadura, Arma arma) {
		this.arma = arma;
		this.armadura = armadura;
		this.vida = 100;
	}

	public void atacarA(Personaje otroPersonaje) {

	}

	public Armadura getArmadura() {
		return this.armadura;
	}

	public Arma getArma() {
		return this.arma;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void disminuirVida(int danio) {
		this.vida -= danio;
	}

	public void recibirAtaque(Personaje otroPersonaje) {
		this.armadura.recibirAtaque(otroPersonaje);
	}

	public void atacar(Personaje otroPersonaje) {
		if ((this.getVida() > 0) && (otroPersonaje.getVida() > 0)) {
			otroPersonaje.recibirAtaque(this);
		}
	}

}
