package com.vjanosigergely.connectsql.services;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.TodoRepoInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

  @Autowired
  private TodoRepoInterface myrepo;

  public List<Todo> findByAssignee(Assignee assignee) {
    return myrepo.findAllByAssignee(assignee);
  }


}
