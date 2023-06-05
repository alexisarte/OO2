package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<>();
	}
	
	public void registrarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public void eliminarUsuario(Usuario usuario) {
		usuario.eliminarTweets();
		this.usuarios.remove(usuario);
	}

	public boolean existeUsuario(Usuario usuario) {
		return this.usuarios.stream().anyMatch(u -> u.getScreenName() == usuario.getScreenName());
	}
	
	// retorna una nueva lista "no modificable" que comparte los mismos objetos que la lista original
	public List<Usuario> getUsuarios() {
		return Collections.unmodifiableList(this.usuarios);
	}
	
}
