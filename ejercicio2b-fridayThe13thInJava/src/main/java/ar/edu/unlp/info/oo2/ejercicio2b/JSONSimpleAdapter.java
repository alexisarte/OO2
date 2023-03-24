package ar.edu.unlp.info.oo2.ejercicio2b;

import java.util.LinkedHashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter extends VoorheesExporter {
	
	private JSONObject exportar(Socio socio) {
		JSONObject obj = new JSONObject(new LinkedHashMap() {{
            put("nombre", socio.getNombre());
            put("legajo", socio.getLegajo());
            put("email", socio.getEmail());
        }});
		return obj;
	}

	@Override
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		JSONArray arr = new JSONArray();
		socios.forEach(socio -> {
			arr.add(this.exportar(socio));
		});
		return arr.toJSONString();
	}

}
