package com.vjanosigergely.reddit.controllers;

import com.vjanosigergely.reddit.models.Post;
import com.vjanosigergely.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
  private PostService postService;

  @Autowired
  public PostController(PostService postService){
    this.postService = postService;
  }

  @GetMapping(value = {"/",""})
  public String showMain(Model model){
    model.addAttribute("posts", postService.findAllOrderByVotes());
    return "index";
  }

  @GetMapping(value = "/submit")
  public String showSubmit(@ModelAttribute(name = "newpost") Post newPost){
    return "submit";
  }

  @PostMapping(value="/submit")
  public String submitNew(@ModelAttribute Post newPost){
    postService.save(newPost);
    return "redirect:/";
  }

  @GetMapping(value = "/increase/{id}")
  public String increaseScore(@PathVariable(name = "id") Long id){
    postService.increaseById(id);
    return "redirect:/";
  }

  @GetMapping(value = "/decrease/{id}")
  public String decreaseScore(@PathVariable(name = "id") Long id){
    postService.decreseById(id);
    return "redirect:/";
  }


}
