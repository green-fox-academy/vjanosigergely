package com.vjanosigergely.connectsql.repository;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepoInterface extends CrudRepository<Todo,Long> {
List<Todo> findAllByDoneIsFalse();
List<Todo> findAll();
List<Todo> findAllByAssignee(Assignee assignee);
void deleteById(Long id);
}
