package ar.edu.unlp.info.oo2.ejercicio1_JavaLogging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import org.json.simple.JSONObject;

public class JSONFormatter extends Formatter {

  @SuppressWarnings("unchecked")
  @Override
  public String format(LogRecord record) {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("message", record.getMessage());
    jsonObject.put("legajo", record.getLevel());
    return jsonObject.toString() + ",";
  }

}