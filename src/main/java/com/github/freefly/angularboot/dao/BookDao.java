package com.github.freefly.angularboot.dao;

import com.github.freefly.angularboot.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by FreeFly on 28.06.2016.
 */
@Repository
public class BookDao {
    @Autowired
    private SessionFactory sessionFactory;

    public List<Book> getAll() {
        return getCurrentSession().createQuery("from com.github.freefly.angularboot.entity.Book").list();
    }

    public Book save(Book book) {
        getCurrentSession().save(book);
        return book;
    }


    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
