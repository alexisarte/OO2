package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;

public class Pending extends ToDoItemState {

	public Pending(ToDoItem context) {
		super(context);
	}

	@Override
	public void start() {
		this.context.setState(new InProgress(this.context));
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	@Override
	public Duration workedTime() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

}
