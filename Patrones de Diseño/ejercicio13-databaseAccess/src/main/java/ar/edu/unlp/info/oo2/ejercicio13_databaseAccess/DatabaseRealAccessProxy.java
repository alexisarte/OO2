package ar.edu.unlp.info.oo2.ejercicio13_databaseAccess;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DatabaseRealAccessProxy implements DatabaseAccess {

	private String password;
	private boolean isLogged;
	private DatabaseRealAccess realDataBase;

	public DatabaseRealAccessProxy(DatabaseRealAccess db, String password) {
		this.password = password;
		this.realDataBase = db;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		return isLogged ? this.realDataBase.insertNewRow(rowData) : -1;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		return isLogged ? this.realDataBase.getSearchResults(queryString) : Collections.emptyList();
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
