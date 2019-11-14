package com.vjanosigergely.connectsql.services;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.AssigneeRepo;
import com.vjanosigergely.connectsql.repository.TodoRepoInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  @Autowired
  private TodoRepoInterface myrepo;
  @Autowired
  private AssigneeRepo assigneeRepo;

  public List<Todo> findByAssignee(Assignee assignee) {
    return myrepo.findAllByAssignee(assignee);
  }
  public void save(Todo todo){
    myrepo.save(todo);
  }
  public List<Todo> findAll(){
    return myrepo.findAll();
  }
  public List<Todo> findAllByDoneIsFalse(){
    return myrepo.findAllByDoneIsFalse();
  }
  public Todo findById(Long id){
    return myrepo.findById(id).orElse(null);
  }

  public void deleteById(Long id){
    Todo selected = myrepo.findById(id).orElse(null);
    Iterable <Assignee> assignees =  assigneeRepo.findAll();
    List <Assignee> assigneeList = new ArrayList<>();
    assignees.forEach(f -> assigneeList.add(f));
    List<Assignee> filteredAssignees =  assigneeList.stream().filter(a -> a.getTodos().contains(selected)).collect(
        Collectors.toList());
    for (int i = 0; i < filteredAssignees.size(); i++) {
      List <Todo> todos = filteredAssignees.get(i).getTodos();
      for (int j = 0; j < todos.size() ; j++) {
        if (todos.get(j).equals(selected)){
          todos.remove(todos.get(j));
        }
      }
      assigneeRepo.save(filteredAssignees.get(i));
    }
    myrepo.deleteById(id);
  }

  public List<Todo> searchByParam(String searchParam, String searchBy){
    List <Todo> searched = new ArrayList<>();
    if (searchBy.equals("assignee")){
    searched = myrepo.findAll().stream().filter(todo -> todo.getAssignee().getName().toLowerCase().contains(searchParam.toLowerCase())).collect(
        Collectors.toList());
    } else if (searchBy.equals("todo")){
      searched = myrepo.findAll().stream().filter(todo -> todo.getTitle().toLowerCase().contains(searchParam.toLowerCase())).collect(
          Collectors.toList());
    } else if (searchBy.equals("dueDate")){
      searched = myrepo.findAll().stream().filter(todo -> todo.getDueDate().contains(searchParam)).collect(
          Collectors.toList());
    } else if (searchBy.equals("creationDate")){
      searched = myrepo.findAll().stream().filter(todo -> todo.getCreationDate().contains(searchParam)).collect(
          Collectors.toList());
    }
    return searched;
  }



}
