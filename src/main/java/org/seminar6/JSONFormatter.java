package org.seminar6;

public class JSONFormatter implements Formatter{
    @Override
    public void format(Book book) {
        System.out.println("Книга " + book.getTitle() +
                " переведена в формат JSON");
    }
}
