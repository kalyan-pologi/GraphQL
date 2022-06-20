package com.example.graphQL.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private String bookID;
    private String title;
    private String publisher;

    public Book() {

    }

    public Book(String bookID, String title, String publisher) {
        this.bookID = bookID;
        this.title = title;
        this.publisher = publisher;
    }

    public Book(String bookID, String title) {
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}

