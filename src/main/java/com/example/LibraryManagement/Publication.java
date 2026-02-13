package com.example.LibraryManagement;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Publication {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final PublicationType type;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected String title;
    protected double price;
    protected String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    protected String publisher;
    protected Long year;

    public Publication(String id, PublicationType type, String title, double price)
    {
        this.id = id;
        this.type = type;
        this.title = title;
        this.price = price;
    }

    public enum PublicationType{
        BOOK,
        MAGAZINE,
        COMIC
    }
}
