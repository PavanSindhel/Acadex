package com.example.demo.BookRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Model.Book;

public interface BookRepository extends MongoRepository<Book,Integer>{

}
