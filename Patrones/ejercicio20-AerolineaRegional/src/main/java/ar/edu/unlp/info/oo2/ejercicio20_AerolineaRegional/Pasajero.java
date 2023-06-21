package ar.edu.unlp.info.oo2.ejercicio20_AerolineaRegional;

public class Pasajero {
	
	private String nombre;
    private String dni;
    
	public Pasajero(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
    
}
