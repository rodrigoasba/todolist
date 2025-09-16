package br.com.rodrigoasba.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigoasba.todolist.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
