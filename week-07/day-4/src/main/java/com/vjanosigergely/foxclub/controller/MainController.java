package com.vjanosigergely.foxclub.controller;

import com.vjanosigergely.foxclub.modells.Fox;
import com.vjanosigergely.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  FoxService foxService;

  @Autowired
  MainController (FoxService foxService){
    this.foxService = foxService;
  }

  @GetMapping (value = "/main")
  public String showMain(Model model, @RequestParam(name = "name", required = false) String name){
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping (value = "/login")
  public String getLogin(Model model, @ModelAttribute(name="fox") Fox fox){
    model.addAttribute("fox", fox);
    return "login";
  }

  @PostMapping (value = "/login")
  public String saveEntry(@ModelAttribute(name="fox") Fox fox){
    System.out.println("The name of the new fox is:" + fox.getName());
    foxService.save(fox);
    System.out.println(foxService.findAll());
    String redirection = "redirect:/main/?name=" + fox.getName();
    return redirection;
  }

  @GetMapping (value ="/list")
  public String foxList(Model model){

    model.addAttribute("list", foxService.findAll());
    return "list";
  }

}
