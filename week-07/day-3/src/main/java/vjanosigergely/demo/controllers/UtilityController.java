package vjanosigergely.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vjanosigergely.demo.services.UtilityService;

@Controller
public class UtilityController {
  UtilityService utilityService;

  UtilityController (UtilityService utilityService){
    this.utilityService = utilityService;
  }

  @GetMapping (value = "/useful")
  public String showUseful(){
    return "index";
  }
  // ## Colored Background
// - Have an endpoint `/useful/colored`
//     - should display an empty page with a random color background
  @GetMapping (value = "/useful/colored")
  public String randomColor(Model model){
    model.addAttribute("color",utilityService.randomColor());
    return "randomcolor";
  }
  //  ## Email validator
// - Endpoint at `/useful/email` with a queryparam
// - Have a link at the main page to an example: `/useful/email?email=is@this.valid`
// - Create a `validateEmail` method in the `UtilityService`
//     - check if the string contains a `@` and a `.`
// - Display the following to the user
//     - `is@this.valid is a valid email address` in green
//     - `not_valid_email.com is not a valid email address` in red

  @GetMapping(value = "/useful/email")
  public String emailValidator(Model model, @RequestParam(name = "email", required = false ) String email){
    if (email == null || email.length() == 0){
      model.addAttribute("validity", "Please provide an email address");
    } else if (utilityService.validateEmail(email)){
      model.addAttribute("validity", email + " is a valid email address");
      model.addAttribute("color", "color: green");
    } else {
      model.addAttribute("validity", email + " is not a valid email address");
      model.addAttribute("color", "color: red");
    }
    return "validation";
  }

  // - Endpoints for encoding and decoding with a `text` and `number` query param
  @GetMapping (value = "/caesar/encoding")
  public String encoder (Model model, @RequestParam(name = "text") String text, @RequestParam (name = "number") int number){
    model.addAttribute("coded", utilityService.caesar(text,number));
    return "caesar";
  }

  @GetMapping (value = "/caesar/decoding")
  public String decoder (Model model, @RequestParam(name = "text") String text, @RequestParam (name = "number") int number){
    model.addAttribute("coded", utilityService.caesar(text,number * (-1)));
    return "caesar";
  }

}
