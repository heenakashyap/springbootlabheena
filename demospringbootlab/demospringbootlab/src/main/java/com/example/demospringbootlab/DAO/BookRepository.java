package com.example.demospringbootlab.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.awt.print.Book;
import java.util.Collection;

public interface BookRepository extends MongoRepository<Book, Integer> {
// we can define methods here like find by title or find ny author

}
