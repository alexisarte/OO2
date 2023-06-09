package ar.edu.unlp.info.oo2.ejercicio1_JavaLogging;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.Handler;

public class DatabaseRealAccessProxy implements DatabaseAccess {

	private String password;
	private boolean isLogged;
	private DatabaseRealAccess realDataBase;
	private static final Logger LOGGER = Logger.getLogger("db");

	public DatabaseRealAccessProxy(DatabaseRealAccess db, String password) throws Exception {
		this.password = password;
		this.realDataBase = db;

		Handler handler = new MailHandler();
		handler.setFormatter(new ShoutingSimpleFormatter());
		FilterHandler filter = new FilterHandler(handler, Arrays.asList("O", "o"));
		LOGGER.addHandler(filter);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (isLogged) {
			LOGGER.warning("Se inserto un registro");
			return this.realDataBase.insertNewRow(rowData);
		}
		LOGGER.severe("Access denied");
		return -1;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (isLogged) {
			LOGGER.info("Obteniendo peliculas");
			return this.realDataBase.getSearchResults(queryString);
		}
		LOGGER.severe("Access denied");
		return Collections.emptyList();
	}

	public void login(String password) {
		if (this.password.equals(password)) {
			this.isLogged = true;
		}
	}

	public void logout() {
		this.isLogged = false;
	}

}
