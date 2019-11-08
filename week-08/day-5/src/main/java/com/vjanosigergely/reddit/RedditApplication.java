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
    Post first = new Post("NST","https://nst.reblog.hu/");
    Post second = new Post("NST","https://nst.reblog.hu/");
    Post third = new Post("NST","https://nst.reblog.hu/");
    Post fourth = new Post("NST","https://nst.reblog.hu/");

    postService.save(first);
    postService.save(second);
    postService.save(third);
    postService.save(fourth);

  }
}
