package com.maryam.aalizadeh.jpadatasample;

import com.maryam.aalizadeh.jpadatasample.model.Author;
import com.maryam.aalizadeh.jpadatasample.model.Book;
import com.maryam.aalizadeh.jpadatasample.model.BookMetaData;
import com.maryam.aalizadeh.jpadatasample.model.Category;
import com.maryam.aalizadeh.jpadatasample.repository.AuthorRepository;
import com.maryam.aalizadeh.jpadatasample.repository.BookMetaDataRepository;
import com.maryam.aalizadeh.jpadatasample.repository.BookRepository;
import com.maryam.aalizadeh.jpadatasample.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataSeeder implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BookMetaDataRepository bookMetaDataRepository;



    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Category category = new Category("Management and Planning");
        Category persistedCategory = categoryRepository.save(category);

        BookMetaData bookMetaData1 = new BookMetaData("This is a good book!");
        BookMetaData persistedMetaData1 = bookMetaDataRepository.save(bookMetaData1);
        Book book1 = new Book("Atomic Habits", "8743443",450, 4.5);
        book1.setCategory(persistedCategory);
        book1.setBookMetaData(bookMetaData1);
        book1.setBookMetaData(persistedMetaData1);
        bookMetaData1.setBook(book1);

        BookMetaData bookMetaData2 = new BookMetaData("I've been reading this book...");
        BookMetaData persistedMetaData2 = bookMetaDataRepository.save(bookMetaData2);
        Book book2 = new Book("5 AM Club", "5454545",450, 4.5);
        book2.setBookMetaData(bookMetaData2);
        book2.setCategory(persistedCategory);
        book2.setBookMetaData(persistedMetaData2);
        bookMetaData2.setBook(book2);

        Book persistedBook1 = bookRepository.save(book1);
        Book persistedBook2 = bookRepository.save(book2);

        Set<Book> books = new HashSet<>();
        books.add(persistedBook1);
        books.add(persistedBook2);

        Author author1 = new Author("James", "Clear");
        author1.setBooks(books);

        Author persistedAuthor = authorRepository.save(author1);

        persistedAuthor.getBooks().forEach(System.out::println);
    }
}
