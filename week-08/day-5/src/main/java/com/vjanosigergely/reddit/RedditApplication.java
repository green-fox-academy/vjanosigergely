package com.vjanosigergely.reddit;

import com.vjanosigergely.reddit.models.Post;
import com.vjanosigergely.reddit.models.User;
import com.vjanosigergely.reddit.services.PostService;
import com.vjanosigergely.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {
  PostService postService;
  UserService userService;

  @Autowired
  RedditApplication(PostService postService, UserService userService){
    this.postService = postService;
    this.userService = userService;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    User lali = new User("lali", "password");
    userService.save(lali);
    Post first = new Post("1","https://nst.reblog.hu/",lali);
    Post second = new Post("2","https://nst.reblog.hu/",lali);
    Post third = new Post("3","https://nst.reblog.hu/",lali);
    Post fourth = new Post("4","https://nst.reblog.hu/",lali);
    Post fifth = new Post("5","https://nst.reblog.hu/",lali);
    Post sixth = new Post("6","https://nst.reblog.hu/",lali);
    Post seventh = new Post("7","https://nst.reblog.hu/",lali);
    Post eighth = new Post("8","https://nst.reblog.hu/",lali);
    Post ninth = new Post("9","https://nst.reblog.hu/",lali);
    Post tenth = new Post("10","https://nst.reblog.hu/",lali);
    Post eleventh = new Post("11","https://nst.reblog.hu/",lali);
    Post a = new Post("12","https://nst.reblog.hu/",lali);
    Post b = new Post("13","https://nst.reblog.hu/",lali);
    Post c = new Post("14","https://nst.reblog.hu/",lali);
    Post d = new Post("15","https://nst.reblog.hu/",lali);
    Post e = new Post("16","https://nst.reblog.hu/",lali);
    Post f = new Post("17","https://nst.reblog.hu/",lali);
    Post g = new Post("18","https://nst.reblog.hu/",lali);
    Post h = new Post("19","https://nst.reblog.hu/",lali);
    Post i = new Post("20","https://nst.reblog.hu/",lali);
    Post j = new Post("21","https://nst.reblog.hu/",lali);


    postService.save(first);
    postService.save(second);
    postService.save(third);
    postService.save(fourth);
    postService.save(fifth);
    postService.save(sixth);
    postService.save(seventh);
    postService.save(eighth);
    postService.save(ninth);
    postService.save(tenth);
    postService.save(eleventh);
    postService.save(a);
    postService.save(b);
    postService.save(c);
    postService.save(d);
    postService.save(e);
    postService.save(f);
    postService.save(g);
    postService.save(h);
    postService.save(i);
    postService.save(j);

  }
}
