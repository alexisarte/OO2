package ar.edu.unlp.info.oo2.ejercicio2b;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExporter extends VoorheesExporter {
	
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		String json = "";
		try {
			return json = new ObjectMapper().writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}

}
