package org.example.model;

public class RentingBook {
    private String title;
    private String author;
    private double price;
    private String reader;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RentingBook() {}
    public RentingBook(String reader, String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.reader = reader;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }
}
