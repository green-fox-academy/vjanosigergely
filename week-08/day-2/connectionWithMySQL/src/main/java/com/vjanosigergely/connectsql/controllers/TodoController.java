package com.vjanosigergely.connectsql.controllers;

import com.vjanosigergely.connectsql.models.Todo;
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
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepoInterface myRepo;

  @Autowired
  public TodoController(TodoRepoInterface todoRepoInterface){
    this.myRepo = todoRepoInterface;
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
  public String showAddForm(@ModelAttribute(name = "newtodo") Todo todo){
    return "add";
  }

  @PostMapping(value = "/add")
  public String addNew(@ModelAttribute Todo todo){
    myRepo.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    myRepo.deleteById(id);
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
