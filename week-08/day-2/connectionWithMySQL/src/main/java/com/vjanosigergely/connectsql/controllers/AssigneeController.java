package com.vjanosigergely.connectsql.controllers;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.AssigneeRepo;
import com.vjanosigergely.connectsql.repository.TodoRepoInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  AssigneeRepo assigneeRepo;
  TodoRepoInterface myrepo;

  @Autowired
  AssigneeController(AssigneeRepo assigneeRepo, TodoRepoInterface myrepo){
    this.assigneeRepo = assigneeRepo;
    this.myrepo = myrepo;
  }

  @GetMapping (value = {"/", "/list"})
  public String showAssignees(Model model){
    model.addAttribute("assignees",assigneeRepo.findAll());
    return "assigneelist";
  }

  @GetMapping(value = "/add")
  public String showAddForm(@ModelAttribute(name = "newassignee") Assignee assignee){
    return "addassignee";
  }

  @PostMapping(value = "/add")
  public String addNew(@ModelAttribute Assignee assignee){
    assigneeRepo.save(assignee);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    Assignee selected = assigneeRepo.findById(id).orElse(null);

    //List <Todo> nulltodoes = new ArrayList<>();

    List <Todo> todoes = selected.getTodos();
    for (int i = 0; i < todoes.size() ; i++) {
      todoes.get(i).setAssignee(null);
      //nulltodoes.add(todoes.get(i));
      //myrepo.save(todoes.get(i));
    }

    assigneeRepo.deleteById(id);
/*
    for (int i = 0; i < nulltodoes.size() ; i++) {
      myrepo.save(nulltodoes.get(i));
    }*/

    /*Iterable <Todo> todos = myrepo.findAll();
    List<Todo> todoList = new ArrayList<>();
    todos.forEach(f -> todoList.add(f));
    List<Todo> filteredTodos = todoList.stream().filter(todo -> todo.getAssignee().equals(selected)).collect(
        Collectors.toList());
    for (int i=0; i< filteredTodos.size(); i++){
      filteredTodos.get(i).;
      myrepo.save(filteredTodos.get(i));
    }
*/
    //assigneeRepo.deleteById(id);
    return "redirect:/assignee/list";
  }



}
