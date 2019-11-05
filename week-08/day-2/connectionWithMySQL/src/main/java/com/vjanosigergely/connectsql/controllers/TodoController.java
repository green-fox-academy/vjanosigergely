package com.vjanosigergely.connectsql.controllers;

import com.vjanosigergely.connectsql.repository.TodoRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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


}
