package com.vjanosigergely.tests.Controllers;

import com.vjanosigergely.tests.models.ErrorObject;
import com.vjanosigergely.tests.models.GrootObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping(value = "/groot")
  public ResponseEntity grootifier (@RequestParam(name = "message" , required = false) String message){
    if (message == null || message.equals("")){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorObject());
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new GrootObject(message));
    }
  }

}
