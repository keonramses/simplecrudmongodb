package com.example.simplecrudmongodb.DAO;

import com.example.simplecrudmongodb.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Component
public class BookDAO {

    @Autowired
    private BookRepository repository;
    public Collection<Book> getBooks() {
        return repository.findAll();
    }

    public Book createBook(Book book) { return repository.insert(book);}
}
