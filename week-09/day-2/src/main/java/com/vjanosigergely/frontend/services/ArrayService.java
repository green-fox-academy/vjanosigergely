package com.vjanosigergely.frontend.services;

import com.vjanosigergely.frontend.Models.MyArray;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ArrayService {

  public ArrayService() {
  }

  public int addArrayNumbers(MyArray myArray){
    int sum = 0;
    for (int number:myArray.getNumbers()){
      sum += number;
    }
    return sum;
  }

  public int multiplyArrayNumbers(MyArray myArray){
    int factor = 1;
    for (int number:myArray.getNumbers()) {
      factor = factor * number;
    }
    return factor;
  }

  public List<Integer> doubleArrayNumbers(MyArray myArray){
    List<Integer> doubledArray = new ArrayList<>();
    for (int number:myArray.getNumbers()) {
      doubledArray.add(number * 2);
    }
    return doubledArray;
  }
}
