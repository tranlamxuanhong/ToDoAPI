/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tlxhong.todoapi.data;

import org.springframework.stereotype.Repository;
import tlxhong.todoapi.models.ToDo;

/**
 *
 * @author tranlamxuanhong
 */
@Repository
public class ToDoInMemoryDao implements ToDoDao {

    @Override
    public ToDo add(ToDo todo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
