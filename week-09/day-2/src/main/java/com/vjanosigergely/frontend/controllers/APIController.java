package com.vjanosigergely.frontend.controllers;

import com.vjanosigergely.frontend.Models.Appender;
import com.vjanosigergely.frontend.Models.DoUntil;
import com.vjanosigergely.frontend.Models.DoublePair;
import com.vjanosigergely.frontend.Models.MyArray;
import com.vjanosigergely.frontend.Models.MyError;
import com.vjanosigergely.frontend.Models.ResultInteger;
import com.vjanosigergely.frontend.Models.ResultIntegerList;
import com.vjanosigergely.frontend.Models.Welcome;
import com.vjanosigergely.frontend.services.ArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

  @Autowired
  ArrayService arrayService;

  @GetMapping("/doubling")
  public ResponseEntity doubleValue(@RequestParam(name = "input", required = false) Integer input){
    if (input != null){
      DoublePair doublepair = new DoublePair(input);
      return ResponseEntity.status(HttpStatus.OK).body(doublepair);
    } else {
      MyError myError = new MyError("Please provide an input!");
      return ResponseEntity.status(HttpStatus.OK).body(myError);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity <?> greetUser(@RequestParam(required = false) String name, @RequestParam(required = false) String title){
    if (name != null && title != null){
      return ResponseEntity.status(HttpStatus.OK).body(new Welcome("Oh, hi there " + name + ", my dear " + title + "!"));
    } else if (title != null){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a name!"));
    } else if (name != null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a title!"));
    } else{
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a name and a title!"));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity <?> appendA(@PathVariable(name = "appendable", required = false) String appendable){
    if (appendable != null){
      return ResponseEntity.status(HttpStatus.OK).body(new Appender(appendable));
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("dountil/{action}")
  public ResponseEntity <?> doUntil(@PathVariable(name = "action", required = false) String action, @RequestBody
      DoUntil doUntil){
    if (doUntil == null ){
      return ResponseEntity.status(HttpStatus.OK).body(new MyError("Please provide a number!"));
    } else if (action.equals("sum")){
      int n = doUntil.getUntil();
      int sum = 0;
      for (int i = 0; i < n + 1 ; i++) {
        sum+=i;
      }
      return ResponseEntity.status(HttpStatus.OK).body(new DoUntil(n,sum));
    } else if (action.equals("factor")){
      int n = doUntil.getUntil();
      int factor = 1;
      for (int i = 1; i < n+1 ; i++) {
        factor = factor * i;
      }
      return ResponseEntity.status(HttpStatus.OK).body(new DoUntil(n,factor));
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity <?> arrayHandler(@RequestBody MyArray myArray){
    if (myArray.getWhat().equals("sum")){
      return ResponseEntity.status(HttpStatus.OK).body(new ResultInteger(arrayService.addArrayNumbers(myArray)));
    } else if (myArray.getWhat().equals("multiply")){
      return ResponseEntity.status(HttpStatus.OK).body(new ResultInteger(arrayService.multiplyArrayNumbers(myArray)));
    } else if (myArray.getWhat().equals("double")){
      return ResponseEntity.status(HttpStatus.OK).body(new ResultIntegerList(arrayService.doubleArrayNumbers(myArray)));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new MyError(" Please provide what to do with the numbers!"));
    }

  }


}
