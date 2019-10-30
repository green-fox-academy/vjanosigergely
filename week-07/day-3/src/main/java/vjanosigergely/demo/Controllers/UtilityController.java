package vjanosigergely.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vjanosigergely.demo.UtilityService;

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

}
