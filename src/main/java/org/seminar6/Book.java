package org.seminar6;

import org.seminar6.BookGenre;

public class Book {
    private String title;
    private String author;
    private int pages;
    private BookGenre name;

    public Book(String title, String author, int pages, BookGenre name) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public BookGenre getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nBook {" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", pages = " + pages +
                ", name = " + name +
                "}";
    }
}
