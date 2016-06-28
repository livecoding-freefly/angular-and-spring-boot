package com.github.freefly.angularboot.controller;

import com.github.freefly.angularboot.entity.Book;
import com.github.freefly.angularboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Book> getAll() {
        return bookService.getAllBooks();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void create(@RequestBody Book book) {
        bookService.createBook(book);
    }

}
