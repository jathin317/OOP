package week4.library.books;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean borrowed;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is already borrowed: " + title);
        }
    }

    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not borrowed: " + title);
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Borrowed: " + borrowed;
    }
}
