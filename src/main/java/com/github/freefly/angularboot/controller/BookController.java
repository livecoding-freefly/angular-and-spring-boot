package com.github.freefly.angularboot.controller;

import com.github.freefly.angularboot.entity.Book;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    List<Book> books = new ArrayList<Book>(){{
        add(new Book("Book name 1"));
        add(new Book("Book name 2 TEST"));
    }};


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Book> getAll() {
        return books;// jakson magic
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void create(@RequestBody Book book) {
        books.add(book);
    }

}
