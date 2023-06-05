package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

public class Retweet extends Tweet {
	
	private Tweet tweetOriginal;

	public Retweet(String texto, Tweet tweetOriginal) {
		super(texto);
		this.tweetOriginal = tweetOriginal;
	}
	
	public Tweet getTweetOriginal() {
		return new Tweet(this.tweetOriginal.getTexto());
	}
	
}
