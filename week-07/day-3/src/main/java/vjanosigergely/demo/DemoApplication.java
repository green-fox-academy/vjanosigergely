package vjanosigergely.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vjanosigergely.demo.services.MyColor;
import vjanosigergely.demo.services.Printer;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
  private Printer printer;
  private MyColor myColor;

  @Autowired
  DemoApplication(Printer printer, MyColor myColor){
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  printer.log("blablabla");
  myColor.printColor();
  }
}
