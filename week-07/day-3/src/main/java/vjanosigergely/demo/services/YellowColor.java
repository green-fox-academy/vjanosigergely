package vjanosigergely.demo.services;

import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor {

  Printer printer;

  public YellowColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is yellow in color...");
  }
}
