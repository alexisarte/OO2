package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public class GuerreroFactory implements PersonajeFactory {
	
	public Personaje createPersonaje() {
		return new Personaje(new ArmaduraDeAcero(), new Espada());
	}
	
}
