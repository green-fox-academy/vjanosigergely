package com.vjanosigergely.foxclub.services;

import com.vjanosigergely.foxclub.modells.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  ArrayList<Fox> foxList = new ArrayList<>();
  ArrayList<String> trickList = new ArrayList<>();
  private static final Fox DEFAULT_FOX = new Fox();

  public FoxService(){
  foxList.add(new Fox("vuk","csoki","vodka"));
  foxList.add(new Fox("karak","kacsa","rum"));
  trickList.add("dance");
  trickList.add("sing");
  trickList.add("code");
  trickList.add("kill");
  }

  public List<Fox> findAll() {
    return foxList;
  }

  public List<String> findTricks(){
    return trickList;
  }
  public void save(Fox newFox) {
    foxList.add(newFox);
  }

  public int count(){
    return foxList.size();
  }

  public Fox findfox (String name){
    Fox result = DEFAULT_FOX;
    for (Fox fox: foxList) {
      if (fox.getName().equals(name)){
        result = fox;
      }
    }

    return result;
  }

  public boolean inList (Fox foxToCheck){
    boolean inList = false;
    for (Fox fox: foxList) {
      if (fox.getName().equals(foxToCheck)){
        inList = true;
      }
    }
    return inList;
  }


}
