package com.vjanosigergely.foxclub.modells;

import java.util.List;

public class Fox {
  String name;
  List<String> listOfTricks;
  String food;
  String drink;

  public Fox(){

  }

  public Fox(String name){
    this.name = name;
  }

  public Fox(String name, List<String> listOfTricks, String food, String drink) {
    this(name);
    this.listOfTricks = listOfTricks;
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(List<String> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}


//create a Fox.class
//it should represent a virtual fox
//it should have at least the followings: name, list of tricks, food and drink
//consider using more classes or enums
//add a new Fox (created with the received name) to a list of Foxes
//find the actual fox based on the name and send it to the template model
//use Thymeleaf to replace the data
//if the fox does not know any tricks yet, display a message instead of an empty list
//if the fox's name is Mr. Green, eats salad, drinks water and knows 0 tricks, the updated information view should represent that