package com.vjanosigergely.frontend.Models;

public class MyError {
  String error = "Please provide an input!";

  public MyError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
