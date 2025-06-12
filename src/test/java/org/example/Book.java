package org.example;

import net.datafaker.Faker;

public class Book {

    Faker faker = new Faker();

    String title;
    String author;
    int pages;

    public Book() {
        this.title = faker.book().title();
        this.author = faker.book().author();
        this.pages = faker.number().numberBetween(20, 600);

    }

    @Override
    public String toString() {
        return "Title: " + title + ", " +  "Author: " + author + ", " + "Pages: " + pages;
    }

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);

    }


}
