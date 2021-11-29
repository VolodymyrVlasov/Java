package com.company;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
    }

    private static void taskOne() {
        List<Book> firstTask = Book.getBookList().stream()
                .filter(book -> book.getPrice().compareTo(BigDecimal.valueOf(200)) <= 0)
                .collect(Collectors.toList());

        System.out.println("\nTASK 1:");
        firstTask.forEach(book -> System.out.println(book.toString()));
    }

    private static void taskTwo() {
        AtomicInteger count = new AtomicInteger();
        List<Book> secondTask = Book.getBookList().stream()
                .peek(book -> {
                    if (book.getPublicationYear() > 1960) count.getAndIncrement();
                    book.setPrice(book.getPrice().add(BigDecimal.valueOf(10)));
                })
                .collect(Collectors.toList());

        System.out.println("\nTASK 2:\ncount = " + count);
        secondTask.forEach(book -> System.out.println(book.toString()));
    }

    private static void taskThree() {
        System.out.println("\nTASK 3:");
        Book.getBookList().forEach(book -> System.out.println(book.getTitle()));
    }

    private static void taskFour() {
        Set<String> authorUniqueList = Book.getBookList().stream()
                .map(Book::getAuthor)
                .collect(Collectors.toSet());

        Map<String, List<Book>> fourthTask = new HashMap<>();

        authorUniqueList.forEach(author -> {
            fourthTask.put(author,
                    Book.getBookList().stream()
                            .filter(book -> book.getAuthor().equals(author))
                            .collect(Collectors.toList()));
        });

        System.out.println("\nTASK 4:");
        fourthTask.entrySet().forEach(System.out::println);
    }
}
