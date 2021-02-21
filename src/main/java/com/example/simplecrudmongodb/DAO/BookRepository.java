package com.example.simplecrudmongodb.DAO;

import com.example.simplecrudmongodb.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, Integer>{
}
