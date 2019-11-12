package com.vjanosigergely.frontend.Models;

public class DoublePair {
  int received;
  int result;

  public DoublePair() {
  }

  public DoublePair(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
