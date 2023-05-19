package ar.edu.unlp.info.oo2.ejercicio3_FacturacionDeLlamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Persoonal {

	private List<Persoona> personas = new ArrayList<Persoona>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
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

	public Persoona registrarUsuario(String data, String nombre) {
		return null;
	}

	public Persoona registrarPersonaFisica(String dni, String nombre) {
		var numeroTelefonico = this.guiaTelefonica.last();
		this.guiaTelefonica.remove(numeroTelefonico);
		Persoona persona = new PersonaFisica(nombre, numeroTelefonico, this, dni);
		this.personas.add(persona);
		return persona;
	}

	public Persoona registrarPersonaJuridica(String cuit, String nombre) {
		var numeroTelefonico = this.guiaTelefonica.last();
		this.guiaTelefonica.remove(numeroTelefonico);
		Persoona persona = new PersonaFisica(nombre, numeroTelefonico, this, cuit);
		this.personas.add(persona);
		return persona;
	}

	public boolean eliminarUsuario(Persoona p) {
		List<Persoona> usuariosNoEliminados = p.getSistema().personas.stream().filter(persona -> persona != p)
				.collect(Collectors.toList());
		boolean borre = false;
		if (usuariosNoEliminados.size() < personas.size()) {
			this.personas = usuariosNoEliminados;
			this.guiaTelefonica.add(p.getTelefono());
			borre = true;
		}
		return borre;

	}

	public Llamada registrarLlamada(Persoona q, Persoona q2, String t, int d) {
		Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.getTelefono());
		x.setRemitente(q2.getTelefono());
		x.dur = d;
		llamadas.add(x);
		q.getLlamadas().add(x);
		return x;

	}

	public double calcularMontoTotalLlamadas(Persoona p) {
		double c = 0;
		Persoona aux = null;
		for (Persoona pp : personas) {
			if (pp.getTelefono() == p.getTelefono()) {
				aux = pp;
				break;
			}
		}
		if (aux == null)
			return c;
		if (aux != null) {
			for (Llamada l : aux.getLlamadas()) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.dur * 3 + (l.dur * 3 * 0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.dur * 200 + (l.dur * 200 * 0.21);
				}
				auxc -= auxc * aux.getDescuento();
				c += auxc;
			}
		}
		return c;
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}

}
