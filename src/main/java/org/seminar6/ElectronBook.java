package org.seminar6;

public class ElectronBook extends Book {
    private String formatRead;
    private Integer size;

    public ElectronBook(String title,
                        String author,
                        int pages,
                        BookGenre name) {
        super(title, author, pages, name);
    }

    public ElectronBook (String title,
                        String author,
                        int pages,
                        BookGenre name,
                        String formatRead,
                        Integer size) {
        super(title, author, pages, name);
        this.formatRead = formatRead;
        this.size = size;
    }
}
