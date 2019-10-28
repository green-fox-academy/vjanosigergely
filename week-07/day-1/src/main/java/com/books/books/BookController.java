package com.books.books;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

private List<Book> myBookList = new ArrayList();

public BookController(){
  myBookList.add(new Book("Cat's Cradle", "Kurt Vonnegut", 1963));
  myBookList.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968));
}

/*@GetMapping(path = "/books")
  public String listBooks (Model model){
  model.addAttribute("books",myBookList);
  return "index.html";
}*/

  @RequestMapping(path = "/books/{id}/details", method = RequestMethod.GET)
  public String getBookById(Model model, @PathVariable(name="id") Integer id) {
    Book bookById = null;

    for(Book book : myBookList) {
      if (book.getId() == id) {
        bookById = book;
      }
    }

    if (bookById != null) {
      model.addAttribute("book", bookById);
    } else {
      model.addAttribute("error", "No book found");
    }

    return "details";
  }


  @RequestMapping(path = "/books", method = RequestMethod.GET)
  public String showBooks(Model model, @RequestParam(name = "author", required = false) String author) {

    List<Book> queriedBooks;

    if (author != null) {
      queriedBooks = filterBooksByAuthor(author);
    } else {
      queriedBooks = myBookList;
    }

    model.addAttribute("books", queriedBooks);
    return "index";
  }

  @RequestMapping(path = "/books/add", method = RequestMethod.GET)
  public String addBookForm(Model model, @ModelAttribute(name="book") Book book) {
    model.addAttribute("book", book);
    return "create";
  }

  @RequestMapping(path = "/books/add", method = RequestMethod.POST)
  public String addBook(@ModelAttribute(name="book") Book book) {
    myBookList.add(book);
    return "redirect:/books";
  }

  private List<Book> filterBooksByAuthor(String author) {
    return myBookList.stream()
        .filter(book -> book.getAuthor().equals(author))
        .collect(Collectors.toList());
  }
}



//details of a book by an id	eg. localhost:8080/books/1
//list all books by a specific author	eg. localhost:8080/books?author=Kurt%20Vonnegut
//save a new book	localhost:8080/books/add