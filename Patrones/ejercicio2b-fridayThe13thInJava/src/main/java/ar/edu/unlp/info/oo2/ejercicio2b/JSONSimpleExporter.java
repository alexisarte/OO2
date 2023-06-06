package ar.edu.unlp.info.oo2.ejercicio2b;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleExporter extends VoorheesExporter {

	@Override
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		
		JSONArray listado = new JSONArray();
		
		for (Socio socio : socios) {
			JSONObject socioJSON = new JSONObject();
			socioJSON.put("nombre", socio.getNombre());
			socioJSON.put("legajo", socio.getLegajo());
			socioJSON.put("email", socio.getEmail());
			listado.add(socioJSON);
		}
		return listado.toJSONString();
	}

}
