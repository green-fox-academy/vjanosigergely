package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  long id;
  String content;

  Greeting(long id, String content){
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }



}


//Create Greeting class with long id and String content fields.
//Create getters for the fields
//Create a constructor using all fields