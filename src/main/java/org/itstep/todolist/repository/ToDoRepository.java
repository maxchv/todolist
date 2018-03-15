package org.itstep.todolist.repository;

import org.itstep.todolist.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="todolist")
public interface ToDoRepository extends JpaRepository<ToDo, Integer> {
}
