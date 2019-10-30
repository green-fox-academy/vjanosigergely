package com.simba.demo.controller;

import com.simba.demo.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankController {

  List<BankAccount> animalAccounts;

  public BankController() {
    animalAccounts = new ArrayList<>();
    animalAccounts.add(new BankAccount("Nala", 5000, "lion"));
    animalAccounts.add(new BankAccount("Zazu", 19000, "hornbill"));
    animalAccounts.add(new BankAccount("Rafiki", 8000, "monkey"));
    animalAccounts.add(new BankAccount("Mufasa", 999999, "lion", true));
    animalAccounts.add(new BankAccount("Scar", 20000, "lion", false, true));
  }

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
    return "index";
  }

  @GetMapping(value = "htmlception")
  public String htmlception(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlception";
  }

  @GetMapping(value = "/accounts")
  public String accounts(Model model) {
    model.addAttribute("accounts", animalAccounts);
    return "accounts";
  }

  @GetMapping(value = "/accounts/add")
  public String addNewAccount(@ModelAttribute(name = "new") BankAccount accountToAdd, Model model) {
    model.addAttribute("accountToAdd", accountToAdd);
    return "add";
  }

  @PostMapping(value = "/accounts/add")
  public String saveNewAccount(@ModelAttribute(name = "new") BankAccount accountToAdd) {
    animalAccounts.add(accountToAdd);
    return "redirect:/accounts";
  }

  @PostMapping(value = "/accounts/increase")
  public String increaseAccount(@RequestParam int index){
    BankAccount selected = animalAccounts.get(index);
    if (selected.isKingOwner()) {
      selected.setBalance(selected.getBalance() + 100);
    } else{
    selected.setBalance(selected.getBalance()+ 10);
    }
    return "redirect:/accounts";
  }
}


//Create a new endpoint and a template also
//Create an List of BankAccounts and fill them with 4-5 characters (from the movie)
//It's up to you which characters you choose
//Show us the elements of your List in a table