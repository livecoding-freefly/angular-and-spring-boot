package com.github.freefly.angularboot.service;

import com.github.freefly.angularboot.dao.BookDao;
import com.github.freefly.angularboot.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    @Transactional
    public Book createBook(Book book) {
        bookDao.save(book);
        return book;
    }

    @Transactional(readOnly = true)
    public List<Book> getAllBooks() {
        return bookDao.getAll();
    }

}
