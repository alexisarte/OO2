package ar.edu.unlp.info.oo2.ejercicio2b;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter extends VoorheesExporter {
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		String json = "";
		try {
			return json = objectMapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}

}
