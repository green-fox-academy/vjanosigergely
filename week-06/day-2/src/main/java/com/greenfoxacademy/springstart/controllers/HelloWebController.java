package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

  AtomicLong counter = new AtomicLong();

  @RequestMapping(value ="/web/greeting")
  public String greeting(@RequestParam String name) {
    //model.addAttribute("name", " World");
    //Hello, Your name! This site was loaded 3 times since last server start.
    String hello = "Hello " + name + "! This site was loaded " + counter.addAndGet(1)+ " times since last server start";
    return hello;
  }

}
