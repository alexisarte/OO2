package ar.edu.unlp.info.oo2.ejercicio1_JavaLogging;

import java.util.logging.SimpleFormatter;
import java.util.logging.LogRecord;

public class ShoutingSimpleFormatter extends SimpleFormatter {

  @Override
  public String format(LogRecord record) {
    return super.format(record).toUpperCase();
  }

}
