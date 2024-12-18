package br.com.todolist.todolist.repository;

import br.com.todolist.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Todo, Long> {
}
