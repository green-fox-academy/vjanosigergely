package com.vjanosigergely.frontend.Models;

import java.util.ArrayList;
import java.util.List;

public class ResultIntegerList {
  List<Integer> result = new ArrayList<>();

  public ResultIntegerList(List<Integer> result) {
    this.result = result;
  }

  public List<Integer> getResult() {
    return result;
  }

  public void setResult(List<Integer> result) {
    this.result = result;
  }
}
