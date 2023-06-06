package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.apache.commons.lang3.RandomStringUtils;

public class UsuarioTest {

	Usuario usuario, usuario2;
	Tweet tweet1, tweetUsuario2;
	Retweet retweet;

	@BeforeEach
	void setUp() throws Exception {
		usuario = new Usuario("usuario1");
		usuario2 = new Usuario("usuario2");
		tweet1 = new Tweet("tweet1");
		tweetUsuario2 = new Tweet("otroTweet");
		retweet = new Retweet("retweet", tweetUsuario2);
	}

	@Test
	void testPostearTweet() {
		var tweets = usuario.getTweets();
		
		usuario.postearTweet("");
		assertEquals(0, tweets.size());
		
		usuario.postearTweet(RandomStringUtils.randomAlphanumeric(281));
		assertEquals(0, tweets.size());
		
		usuario.postearTweet("tweet2");
		assertEquals(1, tweets.size());
	}

	@Test
	void testRetweetear() {
		var tweets = usuario.getTweets();
		
		usuario.retweetear("", tweetUsuario2);
		assertEquals(0, tweets.size());
		
		usuario.retweetear(RandomStringUtils.randomAlphanumeric(281), tweetUsuario2);
		assertEquals(0, tweets.size());
		
		usuario.retweetear("Retweet", tweetUsuario2);
		assertEquals(1, tweets.size());
		assertEquals(tweetUsuario2.getTexto(), retweet.getTweetOriginal().getTexto());
	}

	@Test
	void testEliminarTweets() {
		usuario.postearTweet("New tweet");
		usuario.postearTweet("");
		
		usuario.eliminarTweets();
		assertTrue(usuario.getTweets().isEmpty());
	}

}
