package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;
import java.time.Instant;

public class Pending extends ToDoItemState {
	


	@Override
	public void start(ToDoItem context) {
		context.setState(new InProgress());
		inicio = Instant.now(); // momento en que se inicia el programa
	}

	@Override
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	

}
