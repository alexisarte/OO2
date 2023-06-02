package ar.edu.unlp.info.oo2.ejercicio1_JavaLogging;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseRealAccessProxyTest {

    private DatabaseRealAccess database;
    private DatabaseRealAccessProxy proxy;
    private String password;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.password = "p455w0rD";
        this.proxy = new DatabaseRealAccessProxy(this.database, this.password);
    }

    @Test
    void testGetSearchResultsWithoutAuthentication() {
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testGetSearchResultsWithAuthentication() {
        this.proxy.login(this.password);
        assertEquals(Arrays.asList("Spiderman", "Marvel"),
                this.proxy.getSearchResults("select * from comics where id=1"));
        this.proxy.logout();
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=1"));
    }

    @Test
    void testInsertNewRowWithoutAuthentication() {
        assertEquals(-1, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=3"));
    }

    @Test
    void testInsertNewRowWithAuthentication() {
        this.proxy.login(this.password);
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"),
                this.proxy.getSearchResults("select * from comics where id=3"));
    }

}
