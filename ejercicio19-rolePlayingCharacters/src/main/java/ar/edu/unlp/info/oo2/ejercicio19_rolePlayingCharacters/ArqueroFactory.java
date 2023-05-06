package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public class ArqueroFactory implements PersonajeFactory {
   
	public Personaje createPersonaje() {
		return new Personaje(new ArmaduraDeCuero(), new Arco());
    }
	
}
