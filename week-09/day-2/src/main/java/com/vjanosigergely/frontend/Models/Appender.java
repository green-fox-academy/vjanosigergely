package com.vjanosigergely.frontend.Models;

public class Appender {
  String appended;

  public Appender(String toAppend) {
    this.appended = toAppend + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
