package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ServicioTelefonico {

	private List<Persona> personas = new ArrayList<Persona>();
	private SortedSet<String> guiaTelefonica = new TreeSet<String>();

	public boolean agregarTelefono(String telefono) {
		return this.guiaTelefonica.add(telefono);
	}

	public Persona registrarPersonaFisica(String dni, String nombre) {
		var numeroTelefonico = this.guiaTelefonica.last();
		this.guiaTelefonica.remove(numeroTelefonico);
		Persona persona = new PersonaFisica(nombre, numeroTelefonico, dni);
		this.personas.add(persona);
		return persona;
	}

	public Persona registrarPersonaJuridica(String cuit, String nombre) {
		var numeroTelefonico = this.guiaTelefonica.last();
		this.guiaTelefonica.remove(numeroTelefonico);
		Persona persona = new PersonaJuridica(nombre, numeroTelefonico, cuit);
		this.personas.add(persona);
		return persona;
	}

	public boolean eliminarUsuario(Persona p) {
		if (this.personas.remove(p)) {
			this.agregarTelefono(p.getTelefono());
			return true;
		}
		return false;
	}

	public Llamada registrarLlamadaNacional(Persona emisor, Persona remitente, int duracion) {
		Llamada llamada = new LlamadaNacional(emisor.getTelefono(), remitente.getTelefono(), duracion);
		emisor.agregarLlamada(llamada);
		return llamada;
	}

	public Llamada registrarLlamadaInternacional(Persona emisor, Persona remitente, int duracion) {
		Llamada llamada = new LlamadaInternacional(emisor.getTelefono(), remitente.getTelefono(), duracion);
		emisor.agregarLlamada(llamada);
		return llamada;
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persona persona) {
		return personas.contains(persona);
	}

}
