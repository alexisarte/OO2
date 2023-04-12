package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;
import java.time.Instant;

public class Finished extends ToDoItemState {

	public Finished(ToDoItem context) {
		super(context);
		this.context.setEndTime(Instant.now());
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public Duration workedTime() {
		return Duration.between(this.context.getStartTime(), this.context.getEndTime());
	}

	public void addComment(ToDoItem item, String comment) {
		item.agregar(comment);
	}

}
