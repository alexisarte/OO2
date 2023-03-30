package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public interface Topografia {
	
	double proporcionDeAgua();
	
	double proporcionDeTierra();
	
	boolean esIgualACompuesta(Topografia otraTopografia);
	
	boolean equals(Object otraTopografia);

}
