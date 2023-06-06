package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public class GuerreroFactory implements PersonajeFactory {
	
	public Personaje createPersonaje() {
		Armadura armadura = new ArmaduraDeAcero();
		Personaje personaje = new Personaje(armadura, new Espada());
		armadura.setPersonaje(personaje);
		return personaje;
	}
	
}
