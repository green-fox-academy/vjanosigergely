package com.vjanosigergely.reddit;

import com.vjanosigergely.reddit.models.Post;
import com.vjanosigergely.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {
  PostService postService;

  @Autowired
  RedditApplication(PostService postService){
    this.postService = postService;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Post first = new Post("1","https://nst.reblog.hu/");
    Post second = new Post("2","https://nst.reblog.hu/");
    Post third = new Post("3","https://nst.reblog.hu/");
    Post fourth = new Post("4","https://nst.reblog.hu/");
    Post fifth = new Post("5","https://nst.reblog.hu/");
    Post sixth = new Post("6","https://nst.reblog.hu/");
    Post seventh = new Post("7","https://nst.reblog.hu/");
    Post eighth = new Post("8","https://nst.reblog.hu/");
    Post ninth = new Post("9","https://nst.reblog.hu/");
    Post tenth = new Post("10","https://nst.reblog.hu/");
    Post eleventh = new Post("11","https://nst.reblog.hu/");

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

  }
}
