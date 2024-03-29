package com.vjanosigergely.h2todo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;

  public Todo(){

  }

  public Todo(String title) {
    this.title = title;
  }

  public Todo(String title, boolean urgent) {
    this.title = title;
    this.urgent = urgent;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}


//Add aTodo class with the fields(id: long, title: String, urgent: boolean(default false), done: boolean(default false))