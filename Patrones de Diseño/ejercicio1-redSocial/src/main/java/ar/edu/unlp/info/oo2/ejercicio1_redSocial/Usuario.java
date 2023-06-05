package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;

	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<>();
	}

	private boolean verificarTexto(String texto) {
		return texto.length() >= 1 && texto.length() <= 280;
	}

	public void postearTweet(String texto) {
		if (this.verificarTexto(texto)) {
			this.tweets.add(new Tweet(texto));
		}
	}

	public void retweetear(String texto, Tweet tweetOriginal) {
		if (this.verificarTexto(texto)) {
			this.tweets.add(new Retweet(texto, tweetOriginal));
		}
	}

	public void eliminarTweets() {
		this.tweets.clear();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	// retorna una nueva lista "no modificable" que comparte los mismos objetos que la lista original
	public List<Tweet>getTweets() {
		return Collections.unmodifiableList(this.tweets);
	}

}
