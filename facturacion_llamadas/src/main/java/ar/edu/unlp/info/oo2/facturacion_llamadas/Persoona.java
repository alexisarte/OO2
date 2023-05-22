package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String tipo;
	private String nombreYApellido;
	private String telefono;
	private String cuit;
	private String dni;
	private Persoonal sistema;
	
	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	public void setLlamadas(List<Llamada> lista1) {
		this.llamadas = lista1;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nya) {
		this.nombreYApellido = nya;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String tel) {
		this.telefono = tel;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String doc) {
		this.dni = doc;
	}
	public Persoonal getSistema() {
		return sistema;
	}
	public void setSistema(Persoonal sis) {
		this.sistema = sis;
	}
	

	
}
