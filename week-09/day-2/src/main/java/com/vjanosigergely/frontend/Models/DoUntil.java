package com.vjanosigergely.frontend.Models;

public class DoUntil {

  int until;
  int result;

  public DoUntil() {
  }

  public DoUntil(int until, int result) {
    this.until = until;
    this.result = result;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
