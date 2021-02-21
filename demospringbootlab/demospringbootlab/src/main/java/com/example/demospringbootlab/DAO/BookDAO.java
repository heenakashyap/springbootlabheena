package com.example.demospringbootlab.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.Collection;

@Component
public class BookDAO {
    @Autowired
    private BookRepository repository;
    public Collection<Book> getBooks(){
        return repository.findAll();
    }

    public Book createBook(Book book){ return repository.insert(book); }
}
