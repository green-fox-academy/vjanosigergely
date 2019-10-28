package com.books.books;

public class Book {
  private int id;
  private String title;
  private String author;
  private int releaseYear;
  int idCounter = 0;

  public Book(){

  }

  public Book(String title, String author, int releaseYear) {
    this.id = idCounter++;
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }
}


//A book has: id, title, author, releaseYear