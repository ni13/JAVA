package Inheritance1;

class Book {
    String title, author, isbn;
}

class ScienceBook extends Book {
    String fieldOfStudy;

    void printDetails() {
        System.out.println("[Science Book]");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Field of Study: " + fieldOfStudy);
    }
}

class NovelBook extends Book {
    String genre;

    void printDetails() {
        System.out.println("[Novel Book]");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Genre: " + genre);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        ScienceBook sb = new ScienceBook();
        sb.title = "Physics Fundamentals";
        sb.author = "Newton";
        sb.isbn = "12345";
        sb.fieldOfStudy = "Physics";
        sb.printDetails();
    }
}
