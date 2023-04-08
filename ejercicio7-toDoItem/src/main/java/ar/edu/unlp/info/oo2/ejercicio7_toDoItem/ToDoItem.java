package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    
    private String name;
    private ToDoItemState state;
    private List<String> comments;

	/**
    * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
    */
    public ToDoItem(String name) {
        this.name = name;
        this.state = new Pending();
        this.comments = new ArrayList<>();
    }
    
    /**
    * Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
    * pending, si se encuentra en otro estado, no hace nada)
    */
    public void start() {
        this.state.start(this);
    }
    
    /**
    * Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
    * estado es paused. Caso contrario (pending o finished) genera un error
    * informando la causa específica del mismo
    */
    public void togglePause() {
    	this.state.togglePause(this);
    }
    
    /**
    * Pasa el ToDoItem a finished (siempre y cuando su estado actual sea 
    * in-progress o pausada, si se encuentra en otro estado, no hace nada)
    */

    public void finish() {
    	this.state.finish(this);
    }
    
    /**
    * Retorna el tiempo que transcurrió desde que se inició la tarea (start)
    * hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
    * haya transcurrido hasta el momento actual. Si la tarea no se inició,
    * genera un error informando la causa específica del mismo.
    */
    public Duration workedTime() {
        return fechaFin - fechaInicio; -> convertir a duration
    }
    
    /**
    * Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
    * contrario no hace nada."
    */
    public void addComment(String comment) {
    	this.state.addComment(this, comment);
    }
    
    public void agregar(String comment) {
    	this.comments.add(comment);
    }
    
    public String getName() {
        return name;
    }
    
    public void setState(ToDoItemState state) {
		this.state = state;
	}
    
}
