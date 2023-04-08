package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;

public class Finished extends ToDoItemState {

	@Override
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public Duration workedTime() {
		return null;
	}

	@Override
	public void addComment(String comment) {

	}

}
