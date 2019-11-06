package com.vjanosigergely.connectsql.controllers;

import com.vjanosigergely.connectsql.models.Assignee;
import com.vjanosigergely.connectsql.models.Todo;
import com.vjanosigergely.connectsql.repository.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  AssigneeRepo assigneeRepo;

  @Autowired
  AssigneeController(AssigneeRepo assigneeRepo){
    this.assigneeRepo = assigneeRepo;
  }

  @GetMapping (value = {"/", "/list"})
  public String showAssignees(Model model){
    model.addAttribute("assignees",assigneeRepo.findAll());
    return "assigneelist";
  }

  @GetMapping(value = "/add")
  public String showAddForm(@ModelAttribute(name = "newassignee") Assignee assignee){
    return "addassignee";
  }

  @PostMapping(value = "/add")
  public String addNew(@ModelAttribute Assignee assignee){
    assigneeRepo.save(assignee);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    assigneeRepo.deleteById(id);
    return "redirect:/assignee/list";
  }



}
