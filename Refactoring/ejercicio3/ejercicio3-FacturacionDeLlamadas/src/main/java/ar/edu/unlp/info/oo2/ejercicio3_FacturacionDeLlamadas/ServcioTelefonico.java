package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ServcioTelefonico {

	private List<Persona> personas = new ArrayList<Persona>();
	private SortedSet<String> guiaTelefonica = new TreeSet<String>();

	public boolean agregarTelefono(String str) {
		boolean encontre = guiaTelefonica.contains(str);
		if (!encontre) {
			guiaTelefonica.add(str);
			encontre = true;
			return encontre;
		} else {
			encontre = false;
			return encontre;
		}
	}

	public Persona registrarPersonaFisica(String dni, String nombre) {
		var numeroTelefonico = this.guiaTelefonica.last();
		this.guiaTelefonica.remove(numeroTelefonico);
		Persona persona = new PersonaFisica(nombre, numeroTelefonico, this, dni);
		this.personas.add(persona);
		return persona;
	}

	public Persona registrarPersonaJuridica(String cuit, String nombre) {
		var numeroTelefonico = this.guiaTelefonica.last();
		this.guiaTelefonica.remove(numeroTelefonico);
		Persona persona = new PersonaJuridica(nombre, numeroTelefonico, this, cuit);
		this.personas.add(persona);
		return persona;
	}

	public boolean eliminarUsuario(Persona p) {
		List<Persona> personasRestantes = this.personas.stream().filter(persona -> persona != p)
				.collect(Collectors.toList());
		boolean borre = false;
		if (personasRestantes.size() < personas.size()) {
			this.personas = personasRestantes;
			this.guiaTelefonica.add(p.getTelefono());
			borre = true;
		}
		return borre;
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

	public double calcularMontoTotalLlamadas(Persona p) {
		double monto = 0;
		Persona persona = buscarPersona(p);
		if (persona == null)
			return monto;
		if (persona != null) {
			monto += persona.calcularMontoLlamadas();
		}
		return monto;
	}

	private Persona buscarPersona(Persona p) {
		for (Persona persona : personas) {
			if (persona.getTelefono() == p.getTelefono()) {
				return persona;
			}
		}
		return null;
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persona persona) {
		return personas.contains(persona);
	}

}
