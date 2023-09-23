package com.maryam.aalizadeh.jpadatasample.model;

import jakarta.persistence.*;

@Entity
public class BookMetaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String summary;

    @OneToOne(mappedBy = "bookMetaData")
    private Book book;

    public BookMetaData() {
    }

    public BookMetaData(String summary) {
        this.summary = summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
