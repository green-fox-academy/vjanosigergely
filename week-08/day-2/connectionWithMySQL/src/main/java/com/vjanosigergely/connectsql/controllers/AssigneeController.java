package com.vjanosigergely.connectsql.controllers;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.services.AssigneeService;
import com.vjanosigergely.connectsql.services.TodoService;
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


  TodoService toDoService;
  AssigneeService assigneeService;

  @Autowired
  AssigneeController(TodoService toDoService, AssigneeService assigneeService){
    this.toDoService = toDoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping (value = {"/", "/list"})
  public String showAssignees(Model model){
    model.addAttribute("assignees",assigneeService.findAll());
    return "assigneelist";
  }

  @GetMapping(value = "/add")
  public String showAddForm(@ModelAttribute(name = "newassignee") Assignee assignee){
    return "addassignee";
  }

  @PostMapping(value = "/add")
  public String addNew(@ModelAttribute Assignee assignee){
    assigneeService.save(assignee);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    assigneeService.deleteById(id);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/{id}/todos")
  public String listTodos(@PathVariable(name = "id") Long id, Model model){
    model.addAttribute("todos", toDoService.findByAssignee(assigneeService.findById(id)));
    return "todoList";
  }

}
