package vjanosigergely.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vjanosigergely.demo.services.StudentService;

@Controller
public class GreenFoxController {
  StudentService studentService;

  @Autowired
  GreenFoxController (StudentService studentService){
    this.studentService = studentService;
  }

  @GetMapping(value = "/gfa")
  public String showMain(Model model){
    model.addAttribute("count",studentService.count());
    return "main";
  }

  @GetMapping(value = "/gfa/list")
  public String showStudents(Model model){
    model.addAttribute("list", studentService.findAll());
    return "studentlist";
  }

   //// - Add new student at new `/gfa/add` endpoint
  ////     - should contain a form with an input for the new student's name
  ////     - send the form to the `GET /gfa/save` endpoint
  ////         - with a query param `name`
  ////         - where you can use the service's `save` to save it
  @GetMapping(value = "gfa/add")
  public String addStudents(){
       return "addingForm";
  }

  @PostMapping(value = "/gfa/add")
  public String saveStudents(@RequestParam String name){
    studentService.save(name);
  return "redirect:/gfa/list";
  }
 // ## Add a student checker page at `/gfa/check`
// - With a form for a `name`
// - Submitting a name the app can display if the student is already in the list
// - Add a link to the main page
  @GetMapping(value = "gfa/check")
  public String checkStudent(){
    return "checker";
  }

  @PostMapping(value = "gfa/check")
  public String showCheckedStudent(Model model, @RequestParam String tocheck){
    String answer = "";
    for (String student: studentService.findAll()){
      if (student.toLowerCase().equals(tocheck.toLowerCase())){
        answer = " is already in the list";
        break;
      } else {
        answer = " is not in the list yet";
      }
    }
    model.addAttribute("status", tocheck + answer);

    return "checked";
  }
}


// Create a controller with a few endpoints where Green Fox can manage their students.

// ## First steps
// - Have a main page at `/gfa`
// - This should contain links to all available pages
//     - List all students at first
// - List all students at `/gfa/list`
//     - should display an unordered list with all the students


// Use this `StudentService` as a dependency for your controller.
