package ar.edu.unlp.info.oo2.ejercicio1_JavaLogging;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseRealAccessProxy implements DatabaseAccess {

	private String password;
	private boolean isLogged;
	private DatabaseRealAccess realDataBase;
	private Logger logger;

	public DatabaseRealAccessProxy(DatabaseRealAccess db, String password) {
		this.password = password;
		this.realDataBase = db;
		this.logger = Logger.getLogger("");
		this.logger.setLevel(Level.INFO);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (isLogged) {
			this.logger.log(Level.WARNING, "Se insertó la tupla");
			return this.realDataBase.insertNewRow(rowData);
		}
		this.logger.log(Level.SEVERE, "Access denied");
		return -1;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (isLogged) {
			this.logger.log(Level.INFO, "Se muestran los resultados");
			return this.realDataBase.getSearchResults(queryString);
		}
		this.logger.log(Level.SEVERE, "Access denied");
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
