package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Instant;

public class InProgress extends ToDoItemState {
	
	public InProgress(ToDoItem context) {
		super(context);
		this.context.setStartTime(Instant.now());
	}
	
	@Override
	public void togglePause() {
		this.context.setState(new Paused(this.context));
	}

	@Override
	public void finish() {
		
	}
	
}
