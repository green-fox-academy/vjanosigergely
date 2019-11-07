package com.vjanosigergely.connectsql.controllers;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.AssigneeRepo;
import com.vjanosigergely.connectsql.repository.TodoRepoInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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

  TodoRepoInterface myRepo;
  AssigneeRepo assigneeRepo;

  @Autowired
  public TodoController(TodoRepoInterface todoRepoInterface, AssigneeRepo assigneeRepo){
    this.myRepo = todoRepoInterface;
    this.assigneeRepo = assigneeRepo;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(name = "isActive", required = false) Boolean isActive){
    if (isActive == null) {
      model.addAttribute("todos", myRepo.findAll());
      return "todolist";
    } else if (isActive == true) {
      model.addAttribute("todos", myRepo.findAllByDoneIsFalse());
      return "todolist";
    } else {
      model.addAttribute("todos", myRepo.findAll());
      return "todolist";
    }

  }

  @GetMapping(value = "/add")
  public String showAddForm(Model model, @ModelAttribute(name = "newtodo") Todo todo){
    List <Assignee> assignees = new ArrayList<>();
        assigneeRepo.findAll().forEach(a -> assignees.add(a));
    model.addAttribute("assignees",assignees);
    return "add";
  }

  @PostMapping(value = "/add")
  public String addNew(@ModelAttribute Todo todo){
    List<Assignee> assignees = new ArrayList<>();
    assigneeRepo.findAll().forEach(assignee -> assignees.add(assignee));
    Assignee selected = assignees.stream().filter(assignee -> assignee.getName().equals(todo.getAssigneeName())).findFirst().orElse(null);
    todo.setAssignee(selected);
    myRepo.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    Todo selected = myRepo.findById(id).orElse(null);
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
      //todos.remove(todos.get(id.intValue()-1));
      assigneeRepo.save(filteredAssignees.get(i));
    }
    //selected.setAssignee(null);
    //System.out.println("we are here");*/
    myRepo.delete(selected);

    return "redirect:/todo/list";
  }

  @GetMapping(value = "/edit/{id}")
  public String showEdit(Model model, @PathVariable(name = "id") Long id){
    List <Assignee> assignees = new ArrayList<>();
    assigneeRepo.findAll().forEach(a -> assignees.add(a));
    model.addAttribute("assignees",assignees);
    Todo toModify = myRepo.findById(id).orElse(null);
    model.addAttribute("todo",toModify);
    return "edit";
  }

  @PostMapping(value = "/edit/{id}")
  public String edit(@ModelAttribute Todo todo, @PathVariable(name = "id") Long id){
    Assignee ofModified = myRepo.findById(id).get().getAssignee();
    todo.setAssignee(ofModified);
    List<Assignee> assignees = new ArrayList<>();
    assigneeRepo.findAll().forEach(assignee -> assignees.add(assignee));
    Assignee selected = assignees.stream().filter(assignee -> assignee.getName().equals(todo.getAssigneeName())).findFirst().orElse(null);
    todo.setAssignee(selected);

    /*Todo toModify = myRepo.findById(id).get();
    toModify.setTitle(todo.getTitle());
    toModify.setUrgent(todo.isUrgent());
    toModify.setDone(todo.isDone());*/
    myRepo.save(todo);

    return "redirect:/todo/list";
  }

  @PostMapping(value = "/search")
  public String search(Model model, @RequestParam String searched){
    List <Todo> searchedItems = new ArrayList();
    myRepo.findAll().forEach(t -> searchedItems.add(t));
    List <Todo> searched2 = searchedItems.stream()
        .filter(todo -> todo.getTitle().toLowerCase().contains(searched.toLowerCase()))
        .collect(Collectors.toList());

    model.addAttribute("todos", searched2);
    return "todolist";
  }



}
