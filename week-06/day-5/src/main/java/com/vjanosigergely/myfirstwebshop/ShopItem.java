package com.vjanosigergely.myfirstwebshop;

public class ShopItem {
  String name;
  String description;
  double price;
  int quantityOfStock;

  public ShopItem(String name, String description, double price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(int quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }
}


//The webshop stores ShopItems with at least 4 fields
// (properties in C#) like name,
// description, price, quantityOfStock