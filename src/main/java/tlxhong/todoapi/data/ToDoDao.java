/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tlxhong.todoapi.data;

import tlxhong.todoapi.models.ToDo;

/**
 *
 * @author tranlamxuanhong
 */
public interface ToDoDao {
    
    ToDo add(ToDo todo);
    
}
