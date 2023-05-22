package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Persoonal {
	private List<Persoona> personas = new ArrayList<Persoona>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private SortedSet<String> guiaTelefonica = new TreeSet<String>();
	private static double descuentoJur = 0.15;
	private static double descuentoFis = 0;
	
	public boolean agregarTelefono(String str) {
		boolean encontre = guiaTelefonica.contains(str);
		if (!encontre) {
			guiaTelefonica.add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}
	}
	
	public Persoona registrarUsuario(String data, String nombre, String t) {
		Persoona var = new Persoona();
		if (t.equals("fisica")) {
			crearPersona(nombre, t, var);
			var.setDni(data);
		}
		else if (t.equals("juridica")) {
			crearPersona(nombre, t, var);
			var.setCuit(data);
		}
		var.setSistema(this);
		personas.add(var);
		return var;

	}

	private void crearPersona(String nombre, String t, Persoona var) {
		String tel = guiaTelefonica.last();
		guiaTelefonica.remove(tel);
		var.setNombreYApellido(nombre);
		var.setTipo(t);
		var.setTelefono(tel);
	}
	
	public boolean eliminarUsuario(Persoona p) {
		List<Persoona> l = p.getSistema().personas.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < personas.size()) {
			this.personas = l;
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
		x.setDuracion(d);
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
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.getLlamadas()) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.getDuracion() *3 + (l.getDuracion()*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.getDuracion() *200 + (l.getDuracion()*200*0.21);
				}
				
				if (aux.getTipo() == "fisica") {
					auxc -= auxc*descuentoFis;
				} else if(aux.getTipo() == "juridica") {
					auxc -= auxc*descuentoJur;
				}
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
