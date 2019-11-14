package com.vjanosigergely.connectsql.services;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.AssigneeRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService {
  @Autowired
  AssigneeRepo assigneeRepo;

  public List<Assignee> findAll(){
    return assigneeRepo.findAll();
  }

  public void save (Assignee assignee){
    assigneeRepo.save(assignee);
  }

  public Assignee inputName(Todo todo){
    List<Assignee> assignees = new ArrayList<>();
    assigneeRepo.findAll().forEach(assignee -> assignees.add(assignee));
    Assignee selected = assignees.stream().filter(assignee -> assignee.getName().equals(todo.getAssigneeName())).findFirst().orElse(null);
    return selected;
  }

  public Assignee assigneeSelector(Todo todo){
    List<Assignee> assignees = new ArrayList<>();
    assigneeRepo.findAll().forEach(assignee -> assignees.add(assignee));
    Assignee selected = assignees.stream().filter(assignee -> assignee.getName().equals(todo.getAssigneeName())).findFirst().orElse(null);
    return selected;
  }

}
