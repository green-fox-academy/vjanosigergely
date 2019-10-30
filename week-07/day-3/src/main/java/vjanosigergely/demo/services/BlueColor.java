package vjanosigergely.demo.services;

public class BlueColor implements MyColor {
  Printer printer;
  BlueColor (Printer printer){
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is blue in color");
  }
}
