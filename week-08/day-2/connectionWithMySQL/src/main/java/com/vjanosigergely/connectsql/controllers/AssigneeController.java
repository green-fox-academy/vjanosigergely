package com.vjanosigergely.connectsql.controllers;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.AssigneeRepo;
import com.vjanosigergely.connectsql.repository.TodoRepoInterface;
import com.vjanosigergely.connectsql.services.ToDoService;
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
  ToDoService toDoService;

  @Autowired
  AssigneeController(AssigneeRepo assigneeRepo, TodoRepoInterface myrepo, ToDoService toDoService){
    this.assigneeRepo = assigneeRepo;
    this.myrepo = myrepo;
    this.toDoService = toDoService;
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

    List <Todo> todoes = selected.getTodos();
    for (int i = 0; i < todoes.size() ; i++) {
      todoes.get(i).setAssignee(null);
    }
    assigneeRepo.deleteById(id);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/{id}/todos")
  public String listTodos(@PathVariable(name = "id") Long id, Model model){
    model.addAttribute("todos", toDoService.findByAssignee(assigneeRepo.findById(id).orElse(null)));
    return "todoList";
  }


}
