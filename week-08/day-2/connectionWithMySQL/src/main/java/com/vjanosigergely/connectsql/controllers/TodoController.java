package com.vjanosigergely.connectsql.controllers;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.AssigneeRepo;
import com.vjanosigergely.connectsql.repository.TodoRepoInterface;
import com.vjanosigergely.connectsql.services.AssigneeService;
import com.vjanosigergely.connectsql.services.TodoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService todoService;
  AssigneeService assigneeService;

  @Autowired
  public TodoController(TodoService todoService, AssigneeService assigneeService){
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(name = "isActive", required = false) Boolean isActive){
    if (isActive == null) {
      model.addAttribute("todos", todoService.findAll());
      return "todolist";
    } else if (isActive == true) {
      model.addAttribute("todos", todoService.findAllByDoneIsFalse());
      return "todolist";
    } else {
      model.addAttribute("todos", todoService.findAll());
      return "todolist";
    }
  }

  @GetMapping(value = "/add")
  public String showAddForm(Model model, @ModelAttribute(name = "newtodo") Todo todo){
    List <Assignee> assignees = assigneeService.findAll();
    model.addAttribute("assignees",assignees);
    return "add";
  }

  @PostMapping(value = "/add")
  public String addNew(@ModelAttribute Todo todo){
    todo.setAssignee(assigneeService.inputName(todo));
    todoService.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    todoService.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/edit/{id}")
  public String showEdit(Model model, @PathVariable(name = "id") Long id){
    List <Assignee> assignees = assigneeService.findAll();
    Todo toModify = todoService.findById(id);
    model.addAttribute("assignees",assignees);
    model.addAttribute("todo",toModify);
    return "edit";
  }

  @PostMapping(value = "/edit/{id}")
  public String edit(@ModelAttribute Todo todo){
    todo.setAssignee(assigneeService.assigneeSelector(todo));
    todoService.save(todo);
    return "redirect:/todo/list";
  }

  @PostMapping(value = "/search")
  public String search(Model model, @RequestParam String searched, @RequestParam(value = "searchBy") String searchBy){
    model.addAttribute("todos", todoService.searchByParam(searched,searchBy));
    return "todolist";
  }

}
