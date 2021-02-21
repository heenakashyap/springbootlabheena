package com.example.demospringbootlab.service;

import com.example.demospringbootlab.DAO.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.Collection;


@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getBooks(){ return bookDAO.getBooks(); }

    public Book createBook(Book book){
        return bookDAO.createBook(book);
    }

}
