package com.vjanosigergely.connectsql;

import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.TodoRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectsqlApplication implements CommandLineRunner {
  TodoRepoInterface todoRepoInterface;

  @Autowired
  public ConnectsqlApplication(TodoRepoInterface todoRepoInterface){
    this.todoRepoInterface = todoRepoInterface;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectsqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
   /* todoRepoInterface.save(new Todo("learn Object Relational Mapping"));
    todoRepoInterface.save(new Todo("learn JAVA"));
    todoRepoInterface.save(new Todo(" learn to stay patient"));
    todoRepoInterface.save(new Todo("learn to love mistakes", true));
    todoRepoInterface.save(new Todo("Brew beer",true));
    todoRepoInterface.save(new Todo("Drink beer",true));
    todoRepoInterface.save(new Todo("Learn to sleep 8 hours in 4 hours",true));
    todoRepoInterface.save(new Todo("Cook meth secretely in the basement"));
    todoRepoInterface.save(new Todo("Annunciate", true ));
    todoRepoInterface.save(new Todo("Procrastinate", true ));*/


  }
}
