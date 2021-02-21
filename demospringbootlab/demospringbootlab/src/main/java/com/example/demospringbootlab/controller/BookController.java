package com.example.demospringbootlab.controller;

import com.example.demospringbootlab.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    //@GetMapping
    //public String getBooks(){
    //return "Hello world";

    @GetMapping
    public Collection<Book> getBooks(){return bookService.getBooks();}

    @PostMapping()
    public Book postBook(@RequestBody Book book){
        return bookService.createBook(book);
    }


}
