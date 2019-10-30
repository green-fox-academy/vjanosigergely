package vjanosigergely.demo;

import org.springframework.stereotype.Service;


public class RedColor implements MyColor {
  Printer printer;

  RedColor(Printer printer){
    this.printer = printer;
  }

  @Override
  public void printColor() {
   printer.log("It is red in color");
  }
}
