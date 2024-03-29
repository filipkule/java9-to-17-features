package com.java.features.java9plusfeatures;

public class RecordsInInnerClasses {

    static Book book = new Book("Title", "Author", "isbn");

    public static void main(String[] args) {
        System.out.println(book.title);
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.book.title);
    }

    public record Book(String title, String author, String isbn) {
    }

    static class InnerClass {
        public static Book book = new Book("InnerTitle", "InnerAuthor", "InnerIsbn");// Before Java 16 we were not allowed
                                                                                                       // to use records as inner class members
    }
}


