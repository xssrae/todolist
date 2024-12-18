package br.com.todolist.todolist.controller;

import br.com.todolist.todolist.entity.Todo;
import br.com.todolist.todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping //POST
    List<Todo> create(@RequestBody Todo todo){ //REQUEST
        return todoService.create(todo);
    }

    @GetMapping //GET
    List<Todo> list(){
        return todoService.list();
    }

    @PutMapping//PUT
    List<Todo> update(@RequestBody @Valid Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")//DELETE
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
