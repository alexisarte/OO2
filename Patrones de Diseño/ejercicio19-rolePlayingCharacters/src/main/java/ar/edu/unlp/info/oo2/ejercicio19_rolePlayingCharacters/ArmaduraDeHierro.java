package ar.edu.unlp.info.oo2.ejercicio19_rolePlayingCharacters;

public class ArmaduraDeHierro extends Armadura {

	@Override
	public void recibirAtaqueDeEspada(Espada espada) {
		this.personaje.disminuirVida(5);
	}

	@Override
	public void recibirAtaqueDeArco(Arco arco) {
		this.personaje.disminuirVida(3);
	}

	@Override
	public void recibirAtaqueDeBaston(Baston aston) {
		this.personaje.disminuirVida(1);
	}

	@Override
	public void recibirAtaqueDesconocido(Arma arma) {
		
	}


}
