package org.seminar6;

public class HTMLFormatter implements Formatter{

    @Override
    public void format(Book book) {
        System.out.println("Книга " + book.getName() +
                " переведена в формат html");
    }
}
