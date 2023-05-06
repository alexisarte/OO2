package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public class MagoFactory implements PersonajeFactory {
    
	public Personaje createPersonaje() {
		return new Personaje(new ArmaduraDeCuero(), new Baston());
    }
	
}
