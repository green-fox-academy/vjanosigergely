package com.vjanosigergely.h2todo.repository;

import com.vjanosigergely.h2todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepoInterface extends CrudRepository <Todo,Long> {

}
