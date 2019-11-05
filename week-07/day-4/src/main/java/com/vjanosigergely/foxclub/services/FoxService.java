package com.vjanosigergely.foxclub.services;

import com.vjanosigergely.foxclub.modells.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  ArrayList<Fox> foxList = new ArrayList<>();

  public FoxService(){

  }

  public List<Fox> findAll() {
    return foxList;
  }

  public void save(Fox newFox) {
    foxList.add(newFox);
  }

  public int count(){
    return foxList.size();
  }


}
