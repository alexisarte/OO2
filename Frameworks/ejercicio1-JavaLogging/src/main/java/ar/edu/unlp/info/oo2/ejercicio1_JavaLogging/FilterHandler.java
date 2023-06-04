package ar.edu.unlp.info.oo2.ejercicio1_JavaLogging;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FilterHandler extends Handler {

	private Handler handler;
	private List<String> words;

	public FilterHandler(Handler handler, List<String> words) {
		this.handler = handler;
		this.words = words;
	}

	public String censoringWords(String message) {
		String newMessage = message;
		for (String word : this.words) {
			newMessage = newMessage.replace(word, "***");
		}
		return newMessage;
	}

	@Override
	public void publish(LogRecord record) {
		if (record.getMessage() != null) {
			record.setMessage(this.censoringWords(record.getMessage()));
		}
		this.handler.publish(record);
	}

	@Override
	public void flush() {
		this.handler.flush();
	}

	@Override
	public void close() throws SecurityException {
		this.handler.close();
	}

}
