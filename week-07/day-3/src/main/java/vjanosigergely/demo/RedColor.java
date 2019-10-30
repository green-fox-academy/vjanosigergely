package vjanosigergely.demo;

import org.springframework.stereotype.Service;


public class RedColor implements MyColor {

  @Override
  public String printColor() {
    return "It is red in color...";
  }
}
