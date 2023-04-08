package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;

public class Paused extends ToDoItemState {

	@Override
	public void togglePause(ToDoItem context) {
		context.setState(new InProgress());
	}

	@Override
	public void finish(ToDoItem context) {
		context.setState(new Finished());
	}

	@Override
	public Duration workedTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
