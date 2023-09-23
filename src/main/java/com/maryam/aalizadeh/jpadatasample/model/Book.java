package com.maryam.aalizadeh.jpadatasample.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String isbn;
    private Integer totalPages;
    private Double rating;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToOne()
    @JoinColumn(name = "bookMetaData_id")
    private BookMetaData bookMetaData;

    public Book() {
    }

    public Book(String title, String isbn, Integer totalPages, Double rating) {
        this.title = title;
        this.isbn = isbn;
        this.totalPages = totalPages;
        this.rating = rating;
//        this.publishedDate = publishedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BookMetaData getBookMetaData() {
        return bookMetaData;
    }

    public void setBookMetaData(BookMetaData bookMetaData) {
        this.bookMetaData = bookMetaData;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", totalPages=" + totalPages +
                ", rating=" + rating +
                ", authors=" + authors +
                ", category=" + category +
                ", bookMetaData=" + bookMetaData +
                '}';
    }
}
