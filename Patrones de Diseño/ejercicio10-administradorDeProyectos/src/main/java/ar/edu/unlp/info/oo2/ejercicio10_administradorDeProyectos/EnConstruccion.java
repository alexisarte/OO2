package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

public class EnConstruccion extends ProyectoState {

	public EnConstruccion(Proyecto proyecto) {
		super(proyecto);
	}

	public void aprobarEtapa() {
		if (this.proyecto.precioProyecto() != 0) {
			this.proyecto.setState(new EnEvaluacion(this.proyecto));
		} else {
			throw new RuntimeException("El precio del proyecto es 0");
		}
	}

	public void modificarGanancia(double ganancia) {
	    var gananciaActual = this.proyecto.getGanancia();
	    if (gananciaActual >= 8 && gananciaActual <= 10) {
	    	this.proyecto.setGanancia(ganancia);
	    }
	}

}
