package com.example.simplecrudmongodb.controller;


import com.example.simplecrudmongodb.Entity.Book;
import com.example.simplecrudmongodb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/books")

public class BookController {
    @Autowired
    private BookService bookService;

    //@GetMapping
    //public String getBooks() {
     //   return "Hello World";
  //}
        @GetMapping
        public Collection<Book> getBooks() {return bookService.getBooks();}

        @PostMapping()
        public Book postBook (@RequestBody Book book){ return bookService.createBook(book);
        }

    }

