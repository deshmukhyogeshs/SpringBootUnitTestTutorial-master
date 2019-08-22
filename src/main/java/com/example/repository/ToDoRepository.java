package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ToDo;

@Repository("toDoRepository")
public interface ToDoRepository extends CrudRepository<ToDo, Long>{

}
