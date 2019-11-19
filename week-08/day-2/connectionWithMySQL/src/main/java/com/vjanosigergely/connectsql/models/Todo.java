package com.vjanosigergely.connectsql.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;
  private String creationDate;
  private String dueDate;
  @ManyToOne()
  private Assignee assignee;
  private String assigneeName;

  public Todo(){
    creationDate = generateDate();
  }

  public Todo(String title) {
    this.title = title;
    creationDate = generateDate();
  }

  public Todo(String title, boolean urgent) {
    this.title = title;
    this.urgent = urgent;
    creationDate = generateDate();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public String getAssigneeName() {
    return assigneeName;
  }

  public void setAssigneeName(String assigneeName) {
    this.assigneeName = assigneeName;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public String getDueDate() {
    if(dueDate != null){
    return dueDate;
    }  else {
      return "";
    }
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public String generateDate(){
      DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
    String formattedDate = formatter.format(LocalDate.now());
    return formattedDate;
  }
}
