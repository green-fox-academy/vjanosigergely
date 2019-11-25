package com.vjanosigergely.tests.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GrootObject {

  String received;
  String translated = "I am Groot!";

  public GrootObject(String received){
    this.received = received;
  }

}
