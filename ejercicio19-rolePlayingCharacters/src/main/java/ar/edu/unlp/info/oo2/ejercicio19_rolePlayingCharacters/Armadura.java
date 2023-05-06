package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public abstract class Armadura {
	
	private int vida;
	
	public Armadura() {
		this.vida = 100;
	}
	

	public int getVida() {
		return this.vida;
	}
	
	public void recibirAtaque(Arma arma) {
		arma.decimeQuienSos(this);
	}

	public abstract void recibirAtaqueDeEspada(Espada espada);
	public abstract void recibirAtaqueDeArco(Arco arco);
	public abstract void recibirAtaqueDeBaston(Baston aston);
	public abstract void recibirAtaqueDesconocido(Arma arma);

	
}
