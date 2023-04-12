package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;
import java.time.Instant;

public abstract class ToDoItemState {
	
	protected ToDoItem context;
	
	public ToDoItemState(ToDoItem context) {
		this.context = context;
	}

	public void start() {
		
	}

	public abstract void togglePause();

	public void finish() {
		
	}

	public Duration workedTime() {
		return Duration.between(this.context.getStartTime(), Instant.now());
	}

	public void addComment(String comment) {
		
	}
	
}
