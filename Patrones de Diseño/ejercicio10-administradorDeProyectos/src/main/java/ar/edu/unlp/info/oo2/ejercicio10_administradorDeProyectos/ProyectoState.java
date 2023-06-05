package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

public abstract class ProyectoState {
	
	protected Proyecto proyecto;

	public ProyectoState(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public void aprobarEtapa() {
		
	}

	public void modificarGanancia(double ganancia) {
		
	}

	public void cancelarProyecto() {
		this.proyecto.setState(new Cancelado(this.proyecto));
	}
}
