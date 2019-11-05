package com.vjanosigergely.foxclub.controller;

import com.vjanosigergely.foxclub.modells.Fox;
import com.vjanosigergely.foxclub.services.FoxService;
import java.util.ArrayList;
import java.util.List;
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
    Fox selected = foxService.findfox(name);

    //System.out.println(selected.getListOfTricks().size());

    if (selected.getName() == null){
      return "login";
    } else {
      model.addAttribute("tricks",selected.getListOfTricks().size());
      model.addAttribute("fox", selected);
      model.addAttribute("tricklist",selected.getListOfTricks());
      return "index";
    }
   // System.out.println(selected.getListOfTricks());
    //model.addAttribute("tricks", selected.getListOfTricks().size());

  }

  @GetMapping (value = "/login")
  public String getLogin(Model model, @ModelAttribute(name="fox") Fox fox){
    model.addAttribute("fox", fox);
    return "login";
  }

  @PostMapping (value = "/login")
  public String login(@ModelAttribute(name="fox") Fox fox){
    System.out.println("The name of the new fox is:" + fox.getName());
    foxService.save(fox);
    System.out.println(foxService.findAll());
    String redirection = "redirect:/main/?name=" + fox.getName();
    return redirection;
  }

  @GetMapping (value = "/register")
  public String showRegistration(@ModelAttribute("fox") Fox fox){
    return "register";
  }

  @PostMapping (value = "/register")
  public String register(@ModelAttribute("fox") Fox fox){
    System.out.println("Fox registered is" + fox.getName());
    if (foxService.inList(fox)){
      return "redirect:/register";
    } else {
      System.out.println("Fox to save is" + fox.getName());
      foxService.save(fox);
      return "redirect:/main/?name=" + fox.getName();
    }
  }

  @GetMapping (value ="/list")
  public String foxList(Model model){

    model.addAttribute("list", foxService.findAll());
    return "list";
  }

  @GetMapping(value ="/tricklist")
  public String trickList(Model model, @RequestParam String name){
    List<String> learnable = foxService.findTricks();
    learnable.removeAll( foxService.findfox(name).getListOfTricks());

    model.addAttribute("foxname",name);
    model.addAttribute("tricks", learnable);
    return "trickcenter";
  }

  @PostMapping(value = "/tricklist")
  public String saveTrick(Model model, @RequestParam String name, @RequestParam String  trick){
    System.out.println("The selected trick for " + name + " is:" + trick);

    foxService.findfox(name).learnTrick(trick);

   String redirection = "redirect:/main/?name=" + name;
    return redirection;
  }


}
