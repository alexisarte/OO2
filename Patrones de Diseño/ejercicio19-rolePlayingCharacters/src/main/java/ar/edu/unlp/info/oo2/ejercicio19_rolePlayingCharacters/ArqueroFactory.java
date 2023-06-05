package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public class ArqueroFactory implements PersonajeFactory {
   
	public Personaje createPersonaje() {
		Armadura armadura = new ArmaduraDeCuero();
		Personaje personaje = new Personaje(armadura, new Arco());
		armadura.setPersonaje(personaje);
		return personaje;
    }
	
}
