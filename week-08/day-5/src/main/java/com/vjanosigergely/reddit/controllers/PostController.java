package com.vjanosigergely.reddit.controllers;

import com.vjanosigergely.reddit.models.Post;
import com.vjanosigergely.reddit.services.PostService;
import com.vjanosigergely.reddit.services.UserService;
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
  private UserService userService;

  @Autowired
  public PostController(PostService postService, UserService userService){
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping(value = {"/{username}", "/{username}/{page}"})
  public String showMain(@PathVariable (name = "username", required = false) String username, @PathVariable (name = "page", required = false) Integer page, Model model){
    if (page == null || page == 0){
      page = 1;
    }

    model.addAttribute("posts", postService.findAllOrderByVotes(page));
    model.addAttribute("page",page);
    model.addAttribute("username", username);
    return "index";
  }

  @GetMapping(value = "/{username}/submit")
  public String showSubmit(@PathVariable(name = "username") String username, @ModelAttribute(name = "newpost") Post newPost){
    return "submit";
  }

  @PostMapping(value="/{username}/submit")
  public String submitNew(@PathVariable(name = "username") String username, @ModelAttribute Post newPost){
    newPost.setPostOwner(userService.findByUsername(username));
    postService.save(newPost);
    return "redirect:/{username}";
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
