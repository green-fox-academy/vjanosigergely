package com.vjanosigergely.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping (value = "/main")
  public String showMain(){
    return "index";
  }

  @GetMapping (value = "/login")
  public String getLogin(){
    return "login";
  }

  @PostMapping (value = "/login")
  public String saveEntry(@RequestParam String name){
    String redirection = "redirect:/?name=" + name;
    return redirection;
  }

}
