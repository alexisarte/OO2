package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public abstract class Armadura {
	
	protected Personaje personaje;
	
	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public void recibirAtaque(Personaje otroPersonaje) {
		otroPersonaje.getArma().decimeQuienSos(this);
	}

	public abstract void recibirAtaqueDeEspada(Espada espada);
	
	public abstract void recibirAtaqueDeArco(Arco arco);
	
	public abstract void recibirAtaqueDeBaston(Baston aston);
	
	public abstract void recibirAtaqueDesconocido(Arma arma);
	
}
