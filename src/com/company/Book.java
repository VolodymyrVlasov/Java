package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private int numberOfPages;
    private String author;
    private BigDecimal price;
    private String description;
    private int publicationYear;

    public Book(int id, String title, int numberOfPages, String author, BigDecimal price, String description, int publicationYear) {
        this.id = id;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.price = price;
        this.description = description;
        this.publicationYear = publicationYear;
    }


    public static List<Book> getBookList() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Martin Iden", 350, "Jack London",
                new BigDecimal(108), "Book about matross", 1909));
        bookList.add(new Book(2, "Flowers for Algernon", 280, "Daniel Keyes",
                new BigDecimal(200), "Book about stupid man that become clever", 1959));
        bookList.add(new Book(3, "It's hard to be god", 330, "Arkady and Boris Strugatsky",
                new BigDecimal(150), "About parallel world with low development", 1964));
        bookList.add(new Book(4, "Harry Potter", 350, "Joan Rawling",
                new BigDecimal(300), "About mags amd magic", 1980));
        bookList.add(new Book(5, "Who will cry if you will die?", 100, "Robin Sharma",
                new BigDecimal(250), "101 advices to live better", 2010));
        return bookList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
