package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

public class EnEvaluacion extends ProyectoState {
	
	public EnEvaluacion(Proyecto proyecto) {
		super(proyecto);
	}

	public void aprobarEtapa() {
		this.proyecto.setState(new Confirmada(this.proyecto));
	}

	public void modificarGanancia(double ganancia) {
	    var gananciaActual = this.proyecto.getGanancia();
	    if (gananciaActual >= 11 && gananciaActual <= 15) {
	    	this.proyecto.setGanancia(ganancia);
	    }
	}
	
}
