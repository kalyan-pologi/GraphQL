package com.example.graphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphQL.model.Book;
import com.example.graphQL.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Query implements GraphQLQueryResolver , GraphQLMutationResolver{

    @Autowired
    BookService bookService;


    public String test(){
        return " hello world";
    }

    public List<Book> GetBooks(){
         return bookService.findAllBook();
     }
     public Book getBookById(String query){
        return bookService.fineOneBook(query);
     }

    public Book addBook(Book book){
        return bookService.addBook(book);
    }

    public Book addBookByField(String bookId , String title){
        Book book = new Book(bookId , title);
        return bookService.addBookByField(book);
    }

    public Book updateBook(String bookId ,Book book){
        Book b = bookService.fineOneBook(bookId);
        b.setTitle(book.getTitle());
        b.setPublisher(book.getPublisher());
        return bookService.saveUpdatedBook(b);
    }
    public Book updateBookByFiled(String bookId , String title , String publisher){
        Book b = bookService.fineOneBook(bookId);
        b.setTitle(title);
        b.setPublisher(publisher);
        return bookService.saveUpdatedBook(b);
    }

    public String deleteBook(String bookId){
        return bookService.deleteBookById(bookId);
    }
}


