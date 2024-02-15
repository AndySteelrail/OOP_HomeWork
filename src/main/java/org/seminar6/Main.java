package org.seminar6;

public class Main {
    public static void main(String[] args) {
        Librarys librarys = new Librarys();
        System.out.println("librarys.bySeaechable(\"Пушкин\") = " +
                librarys.bySearcheable("Пушкин"));
        System.out.println();
        Formatter formatter = new JSONFormatter();
        formatter.format(librarys.getBooks().get(0));
        System.out.println();
        formatter = new TextFormatter();
        formatter.format(librarys.getBooks().get(0));

        ElectronBook electronBook = new ElectronBook("Java полное руководство",
                "Шилдт Г.",
                200,
                null,
                "txt",
                1024);
        librarys.addBook(electronBook);
        System.out.println(librarys.getBooks());
    }
}
