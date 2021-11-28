package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Book> firstTask = Book.getBookList().stream()
                .filter(book -> book.getPrice().compareTo(BigDecimal.valueOf(200)) <= 0)
                .collect(Collectors.toList());

        AtomicInteger count = new AtomicInteger();
        List<Book> secondTask = Book.getBookList().stream()
                .peek(book -> {
                    if (book.getPublicationYear() > 1960) count.getAndIncrement();
                    book.setPrice(book.getPrice().add(BigDecimal.valueOf(10)));
                })
                .collect(Collectors.toList());


        System.out.println("\nfirstTask:");

        for (Book book : firstTask) {
            System.out.println(book.toString());
        }

        System.out.println("\nsecondTask:\ncount = " + count);

        for (Book book : secondTask) {
            System.out.println(book.toString());
        }

        System.out.println("\nthirdTask:");

        for (Book book : secondTask) {
            System.out.println(book.getTitle());
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
