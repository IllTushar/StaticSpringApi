package com.example.demo.Controler;

import com.example.demo.Model.ToDoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControlers {
    @Autowired
    private Services toServices;
    @RequestMapping("/todo")
    public List<ToDoResponse> getAllToDo(){
        return toServices.getAllTodos();
    }
    @RequestMapping("/todo/{name}")
    public ToDoResponse getIdTodo(@PathVariable String name){
        return toServices.getIdTodo(name);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/todo")
    public void createToDo(@RequestBody ToDoResponse todo){
        toServices.createTodo(todo);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/todo/{name}")
    public void updateToDo(@PathVariable String name,@RequestBody ToDoResponse toDoResponse){
 //       toServices.updateToDO(name,toDoResponse);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/todo/{name}")
    public void deleteField(@PathVariable String name){
        toServices.deleteField(name);
    }
}
