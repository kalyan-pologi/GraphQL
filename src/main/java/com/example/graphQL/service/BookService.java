package com.example.graphQL.service;

import com.example.graphQL.model.Book;
import com.example.graphQL.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }
    public Book fineOneBook(String query){
        return bookRepository.findById(query).get();
    }

    public Book addBook(Book b) {
       return bookRepository.save(b);
    }
    public Book addBookByField(Book b) {
        return bookRepository.save(b);
    }

    public Book saveUpdatedBook(Book b) {
        return bookRepository.save(b);
    }

    public String deleteBookById(String bookId) {
         bookRepository.deleteById(bookId);
         return "deleted Successfully";
    }
}


