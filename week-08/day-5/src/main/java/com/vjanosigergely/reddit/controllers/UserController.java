package com.vjanosigergely.reddit.controllers;

import com.vjanosigergely.reddit.models.User;
import com.vjanosigergely.reddit.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  private IUserService userService;

  @Autowired
  public UserController(IUserService userService) {
    this.userService = userService;
  }

  @GetMapping(value = {"/register", "/register/"})
  public String register (){
    return "registration";
  }

  @PostMapping(value = {"/register", "/register/"})
  public String register (@RequestParam(name = "username") String username,
      @RequestParam(name = "password") String password){
    if (userService.findByUsername(username) != null){
      System.out.println(username + "already exists");
      return "redirect:/register";
    } else {
      User newUser = new User(username,password);
      this.userService.save(newUser);
      System.out.println(newUser.getUsername()+ "is the new user");
      return "redirect:/" + username;
    }

  }
}
