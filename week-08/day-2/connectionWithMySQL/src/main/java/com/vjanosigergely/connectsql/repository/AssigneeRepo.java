package com.vjanosigergely.connectsql.repository;

import com.vjanosigergely.connectsql.models.Assignee;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepo extends CrudRepository<Assignee,Long> {
List<Assignee> findAll();

}


