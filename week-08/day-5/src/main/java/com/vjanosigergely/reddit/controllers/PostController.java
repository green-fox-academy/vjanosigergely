package com.vjanosigergely.reddit.controllers;

import com.vjanosigergely.reddit.models.Post;
import com.vjanosigergely.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PostController {
  private PostService postService;

  @Autowired
  public PostController(PostService postService){
    this.postService = postService;
  }

  @GetMapping(value = "/")
  public String showMain(Model model){
    model.addAttribute("posts", postService.findAll());
    return "index";
  }

  @GetMapping(value = "/submit")
  public String showSubmit(@ModelAttribute Post newpost){
    return "submit";
  }

  

}
