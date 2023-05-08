package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public class MagoFactory implements PersonajeFactory {
    
	public Personaje createPersonaje() {
		Armadura armadura = new ArmaduraDeCuero();
		Personaje personaje = new Personaje(armadura, new Baston());
		armadura.setPersonaje(personaje);
		return personaje;
    }
	
}
