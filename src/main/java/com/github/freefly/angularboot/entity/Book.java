package com.github.freefly.angularboot.entity;

import javax.persistence.*;

/**
 * Created by FreeFly on 28.06.2016.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
