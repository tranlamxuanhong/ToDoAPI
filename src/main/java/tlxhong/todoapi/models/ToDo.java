/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tlxhong.todoapi.models;

/**
 *
 * @author tranlamxuanhong
 */
public class ToDo {
    
    private int id;
    private String todo;
    private String note;
    private boolean finished;
    
    public int getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public String getNote() {
        return note;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    
}
