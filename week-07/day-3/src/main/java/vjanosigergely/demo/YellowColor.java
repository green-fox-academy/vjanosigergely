package vjanosigergely.demo;

import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor {

  @Override
  public String printColor() {
    return "It is yellow in color...";
  }
}
