package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  @RequestMapping(value="/greeting")
public Greeting greeting(@RequestParam String name){
  return new Greeting(28,"Hello " + name);
}
}


//Add greeting method and use @RequestMapping annotation.
//Create and return a Greeting object when it is called.