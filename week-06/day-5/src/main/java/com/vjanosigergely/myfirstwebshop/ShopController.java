package com.vjanosigergely.myfirstwebshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {
  private List<ShopItem> myItemList = new ArrayList<>();

  ShopController(){
    myItemList.add(new ShopItem("BttF Shoes","Nike Back to the Future-style Self-lacing shoes",199.99,15));
    myItemList.add(new ShopItem("Flux Capacitor","Doc Browns limited edition time-traveling engine is"
        + " now commercially available exclusively on our site ",49000.00,0));
    myItemList.add(new ShopItem("Toby Jug","If you want a proper English mug,"
        + "drink tea from this queen-shaped Toby Jug",199.99,28));
    myItemList.add(new ShopItem("Fried Snickers",
        "Instant heart-attack guaranteed",10.99,150));
    myItemList.add(new ShopItem("Football Shoes","Nike Mercury football shoes",750.25,15));
  }

  @GetMapping(value = "/itemList")
  public String listBooks(Model model) {
    model.addAttribute("items", myItemList);
    return "webshop";
  }

  @GetMapping(value = "/only-available")
  public String availabeItems(Model model){
    List availableItems = myItemList.stream()
        .filter(item -> item.quantityOfStock > 0)
        .collect(Collectors.toList());
    model.addAttribute("items", availableItems);
    return "webshop";
  }

  @GetMapping(value = "/cheapest-first")
  public String cheapestFirst(Model model){
    List cheapestFirst = myItemList.stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice))
        .collect(Collectors.toList());

    model.addAttribute("items", cheapestFirst);
    return "webshop";
  }

  @GetMapping(value = "/contains-nike")
  public String containsNike(Model model){
    List containsNike = myItemList.stream()
        .filter(l -> l.description.toLowerCase().contains("nike") || l.name.toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("items", containsNike);
    return "webshop";
  }

  @GetMapping(value = "/average-stock")
  public String averageStock(Model model){
    String average = "The average stock is: ";
    Double averageStock = myItemList.stream()
        .map(i -> i.quantityOfStock)
        .mapToDouble(i -> i)
        .average()
        .orElse(-1);
    model.addAttribute("name", average + averageStock);
    return "webshopTextDisplay";
  }

  @GetMapping(value = "/most-expensive")
  public String mostExpensive(Model model){
    String expensive = " is the most expensive product available";
    ShopItem mostExpensive = myItemList.stream()
        .filter(item -> item.quantityOfStock > 0)
        .max(Comparator.comparingDouble(ShopItem::getPrice))
        .orElse(myItemList.get(0));
       /* .map(i -> i.price)
        .mapToDouble(i -> i)
        .max()
        .orElse(-1);*/
    model.addAttribute("name", mostExpensive.name + expensive);
    return "webshopTextDisplay";
  }

  @PostMapping(value = "/search")
  public String search(Model model, @RequestParam String searched){
    List searchedItems = myItemList.stream()
        .filter(product -> product.getDescription().toLowerCase().contains(searched.toLowerCase()) || product.getName().toLowerCase() .contains(searched.toLowerCase()))
        .collect(Collectors.toList());
    model.addAttribute("items", searchedItems);
    return "webshop";
  }


}
