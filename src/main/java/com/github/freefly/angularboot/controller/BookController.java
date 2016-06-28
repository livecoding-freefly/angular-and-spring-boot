package com.github.freefly.angularboot.controller;

import com.github.freefly.angularboot.entity.Book;
import com.github.freefly.angularboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    public static final String BOOK_ID = "bookId";

    @Autowired
    private BookService bookService;

    // URL: /api/books
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Book> getAll() {
        return bookService.getAllBooks();
    }

    // URL: /api/books/{bookId}
    @RequestMapping(value = "{" + BOOK_ID + "}", method = RequestMethod.GET)
    public Book getById(@PathVariable(BOOK_ID) Integer bookId) {
        return bookService.getBookById(bookId);
    }

    // URL: /api/books
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void create(@RequestBody Book book) {
        bookService.createBook(book);
    }



}
