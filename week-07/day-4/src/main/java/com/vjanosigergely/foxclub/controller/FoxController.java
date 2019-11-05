package com.vjanosigergely.foxclub.controller;

import com.vjanosigergely.foxclub.modells.Fox;
import com.vjanosigergely.foxclub.services.FoxService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  FoxService foxService;

  @Autowired
  FoxController (FoxService foxService){
    this.foxService = foxService;
  }

  @GetMapping(value = "/nutritionstore")
  //public String addFood(){
  public String addFood (Model model, @RequestParam String name) {
    model.addAttribute("foxname", name);
    return "nutrition";
  }

  @PostMapping(value = "/nutritionstore")
  public String saveEntry(Model model, @RequestParam String name, @RequestParam String  selectedFood, @RequestParam String selectedDrink){
    foxService.findfox(name).setFood(selectedFood);
    foxService.findfox(name).setDrink(selectedDrink);

    String redirection = "redirect:/main/?name=" + name;
    return redirection;
  }

}
