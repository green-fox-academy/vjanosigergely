package com.vjanosigergely.h2todo.contollers;

import com.vjanosigergely.h2todo.repository.TodoRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping ("/todo")
public class TodoController {

  TodoRepoInterface myRepo;

  @Autowired
  public TodoController(TodoRepoInterface todoRepoInterface){
    this.myRepo = todoRepoInterface;
  }

  @GetMapping (value = {"/", "/list"})
  public String list(Model model){
    model.addAttribute("todos",myRepo.findAll());
    return "todolist";
  }

  //In the list method of the Controller use the repository to find all elements and
  // add them to the model as "todos" attribute

  //Add a public String list() method which maps to / and /list in the controller, which returns with
  // "This is my firstTodo" string. Use the @ResponseBody annotation.

}
