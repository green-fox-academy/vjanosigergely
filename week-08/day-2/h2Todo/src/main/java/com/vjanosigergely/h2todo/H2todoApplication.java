package com.vjanosigergely.h2todo;

import com.vjanosigergely.h2todo.models.Todo;
import com.vjanosigergely.h2todo.repository.TodoRepoInterface;
//import jdk.jfr.internal.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2todoApplication implements CommandLineRunner {
  TodoRepoInterface todoRepoInterface;

  @Autowired
  H2todoApplication(TodoRepoInterface todoRepoInterface){
    this.todoRepoInterface = todoRepoInterface;
  }

  public static void main(String[] args) {
    SpringApplication.run(H2todoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepoInterface.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepoInterface.save(new Todo("I have to learn JAVA"));
    todoRepoInterface.save(new Todo("I have to learn JAVA"));
  }
}
