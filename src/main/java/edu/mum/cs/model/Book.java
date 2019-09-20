package edu.mum.cs.model;

public class Book {
    private String bookTittle;
    private String isbn;

    public Book() {
    }

    public Book(String bookTittle, String isbn) {
        this.bookTittle = bookTittle;
        this.isbn = isbn;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTittle='" + bookTittle + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
