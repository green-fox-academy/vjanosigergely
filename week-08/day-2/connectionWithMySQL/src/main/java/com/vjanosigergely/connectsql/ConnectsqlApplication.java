package com.vjanosigergely.connectsql;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.AssigneeRepo;
import com.vjanosigergely.connectsql.repository.TodoRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectsqlApplication implements CommandLineRunner {
  TodoRepoInterface todoRepoInterface;
  AssigneeRepo assigneeRepo;

  @Autowired
  public ConnectsqlApplication(TodoRepoInterface todoRepoInterface, AssigneeRepo assigneeRepo){
    this.todoRepoInterface = todoRepoInterface;
    this.assigneeRepo = assigneeRepo;
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
   Assignee assignee1 = new Assignee("Riel","Riel@Riel.com");
    Assignee assignee2 = new Assignee("Adam","adam@adam.hu");
    assignee1.addTodo(new Todo("learn Object Relational Mapping"));
    assignee1.addTodo(new Todo("learn JAVA"));
    assignee1.addTodo(new Todo("learn to love mistakes", true));
    assignee1.addTodo(new Todo("Annunciate", true ));
    assignee2.addTodo(new Todo("Procrastinate", true ));
    assignee2.addTodo(new Todo("Cook meth secretely in the basement"));
    assigneeRepo.save(assignee1);
    assigneeRepo.save(assignee2);



  }
}
