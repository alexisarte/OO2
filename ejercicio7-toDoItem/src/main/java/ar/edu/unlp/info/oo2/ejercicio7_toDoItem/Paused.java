package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

public class Paused extends ToDoItemState {

	public Paused(ToDoItem context) {
		super(context);
	}

	@Override
	public void togglePause() {
		this.context.setState(new InProgress(this.context));
	}

	@Override
	public void finish() {
		this.context.setState(new Finished(this.context));
	}

}
