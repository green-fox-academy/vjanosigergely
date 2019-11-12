package com.vjanosigergely.frontend.Models;

public class Welcome {
String welcome_message;

  public Welcome(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
