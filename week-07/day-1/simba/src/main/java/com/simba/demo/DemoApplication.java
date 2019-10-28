package com.simba.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}


//We are creating a Lion King based BankAccount Application today
//For this create a BankAccount class in your model package/folder
//Add the fields (properties in C#) name, balance, animalType in it
//In your controller create the first endpoint called /show
//Instantiate a new BankAccount("Simba", 2000, "lion")
//Java: Add this BankAccount to the model
//C#: Add this BankAccount to the View
//Create a template where you show the fields of the BankAccount