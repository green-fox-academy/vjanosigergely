package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  AtomicLong counter = new AtomicLong();

  @RequestMapping(value="/greeting")
public Greeting greeting(@RequestParam String name){

  return new Greeting(counter.addAndGet(1), "Hello " + name);

}
}


//Add greeting method and use @RequestMapping annotation.
//Create and return a Greeting object when it is called.