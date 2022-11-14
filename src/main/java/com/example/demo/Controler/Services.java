package com.example.demo.Controler;

import com.example.demo.Model.ToDoResponse;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class Services {
    private List<ToDoResponse> todos=new ArrayList<>(
            Arrays.asList(new ToDoResponse(1,"Tushar","Budaun","UP"),
                    new ToDoResponse(2,"Aman","Rohotak","UP"),
                    new ToDoResponse(3,"Nitin","Nasik","Maharastra")
            )
    );
    public List<ToDoResponse> getAllTodos(){
        return todos;
    }


    public ToDoResponse getIdTodo(String name) {
        return todos.stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }

    public void createTodo(ToDoResponse todo) {
        todos.add(todo);
    }

    public void deleteField(String name)
    {
    todos.removeIf(t -> t.getName().equals(name));
    }


// Not working because not get ID
//    public void updateToDO(String name, ToDoResponse toDoResponse)
//    {
//        for (int i = 0; i <todos.size() ; i++) {
//          ToDoResponse toDoResponse1 = todos.get(i);
//          if (toDoResponse1.getName().equals(name)){
//              todos.set(name.,toDoResponse);
//              return;
//          }
//        }
//    }
}
