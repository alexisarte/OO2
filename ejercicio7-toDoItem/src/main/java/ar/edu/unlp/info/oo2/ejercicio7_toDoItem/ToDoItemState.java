package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;
import java.time.Instant;

public abstract class ToDoItemState {
	
	Instant inicio;

	
	public void start(ToDoItem item) {
		
	}

	public abstract void togglePause(ToDoItem item);

	public void finish(ToDoItem item) {
		
	}

	@Override
	public Duration workedTime() {
		return Duration.between(inicio, Instant.now());
	}

	public void addComment(ToDoItem todo, String comment) {
		
	}
	
}
