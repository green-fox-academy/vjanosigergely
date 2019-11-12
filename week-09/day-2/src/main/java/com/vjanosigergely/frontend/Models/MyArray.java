package com.vjanosigergely.frontend.Models;

import java.util.List;

public class MyArray {
  String what;
  List<Integer> numbers;

  public MyArray() {
  }

  public MyArray(String what, List<Integer> numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

}


//{
//  "what": "sum",
//  "numbers": [1, 2, 5, 10]
//}
//what can be 3 things: sum, multiply, double