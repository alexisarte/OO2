package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwitterTest {
	
	Twitter twitter;
    Usuario usuario1, usuario2, usuario3;
	
	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
        usuario1 = new Usuario("usuario1");
        usuario2 = new Usuario("usuario2");
        usuario3 = new Usuario("usuario3");
        twitter.registrarUsuario(usuario1);
        twitter.registrarUsuario(usuario2);
	}
	
	@Test
    void testRegistrarUsuario() {
        twitter.registrarUsuario(usuario3);
        
        assertTrue(twitter.existeUsuario(usuario3));
    }
	
	public void testEliminarUsuario() {
		usuario2.postearTweet("Hola, este es mi primer tweet");
		usuario2.postearTweet("Estoy probando la red social Twitter");
        
        twitter.eliminarUsuario(usuario2);
        
        assertFalse(twitter.existeUsuario(usuario2));
        assertEquals(1, twitter.getUsuarios().size());
        assertTrue(usuario1.getTweets().isEmpty());
    }

    @Test
    void testExisteUsuario() {
        assertTrue(twitter.existeUsuario(usuario1));
        
        twitter.eliminarUsuario(usuario1);
        
        assertFalse(twitter.existeUsuario(usuario1));
    }
    
    @Test
    void getUsuarios() {
    	var usuarios = twitter.getUsuarios();
        assertTrue(usuarios.contains(usuario1) && usuarios.contains(usuario2));
        assertEquals(2, usuarios.size());
    }
    
}


