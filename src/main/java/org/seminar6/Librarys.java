package org.seminar6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Librarys implements Searchable, LibraryManage {
    private List<Book> books;

    public Librarys() {
        books = fullBook();
    }

    private List<Book> fullBook() {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(new Book (
                    "Метель",
                    "Пушкин А.С",
                    new Random().nextInt(100),
                    new BookGenre("Любовный роман")));
        }
        return result;
    }

    @Override
    public List<Book> bySearcheable(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                result.add(book);
            }
        }
        return result;
    };

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }
}
