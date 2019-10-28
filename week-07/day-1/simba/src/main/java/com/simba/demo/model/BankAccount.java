package com.simba.demo.model;

public class BankAccount {
  //Add the fields (properties in C#) name, balance, animalType in it
  private String name;
  private double balance;
  private String animalType;
  boolean kingOwner = false;
  boolean badGuy = false;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public BankAccount(String name, double balance, String animalType, boolean isKing) {
    this(name,balance,animalType);
    kingOwner = isKing;
  }

  public BankAccount(String name, double balance, String animalType, boolean isKing, boolean badGuy) {
    this(name,balance,animalType,isKing);
    this.badGuy = badGuy;
}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKingOwner() {
    return kingOwner;
  }

  public void setKingOwner(boolean kingOwner) {
    this.kingOwner = kingOwner;
  }

  public boolean isBadGuy() {
    return badGuy;
  }

  public void setBadGuy(boolean badGuy) {
    this.badGuy = badGuy;
  }
}
