package com.example.bookapp;

public class Book {
    private String author;
    private String title;
    private String description;
    private String price;
    private String isInStock;

    public Book() {
    }

    public Book(String author, String title, String description, String price, String isInStock) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }

    public String getDisplayText(){
        return "Author: " + getAuthor() + '\t' +
                "Title: " + getTitle() + '\t' +
                "Description: " + getDescription() + '\n';
    }
}
