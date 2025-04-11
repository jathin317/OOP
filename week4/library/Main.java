package week4.library;

import week4.library.books.Book;
import week4.library.users.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName;
        String userId;

        System.out.print("Enter the user name: ");
        userName = sc.nextLine();
        System.out.print("Enter the user id: ");
        userId = sc.nextLine();
        User user = new User(userName, userId);
        System.out.println("User Details: " + user);

        // Create book instances
        Book book1 = new Book("Java Programming", "John Doe", 12345);
        Book book2 = new Book("Data Structures", "Jane Smith", 67890);

        while (true) {
            System.out.println("\n1. Borrow a book\n2. Return a book\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the book ISBN: ");
                    int isbnToBorrow = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (isbnToBorrow == book1.getIsbn()) {
                        book1.borrowBook();
                    } else if (isbnToBorrow == book2.getIsbn()) {
                        book2.borrowBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the book ISBN: ");
                    int isbnToReturn = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (isbnToReturn == book1.getIsbn()) {
                        book1.returnBook();
                    } else if (isbnToReturn == book2.getIsbn()) {
                        book2.returnBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nCurrent Book Details:");
            System.out.println(book1); // Use toString() method
            System.out.println(book2); // Use toString() method
        }
    }
}

/*
 * Sample Output:
 * Enter the user name: Alice
 * Enter the user id: U123
 * User Details: User{name='Alice', id='U123'}
 * 
 * 1. Borrow a book
 * 2. Return a book
 * 3. Exit
 * Enter your choice: 1
 * Enter the book ISBN: 12345
 * 
 * Current Book Details:
 * Book{title='Java Programming', author='John Doe', isbn=12345,
 * isBorrowed=true}
 * Book{title='Data Structures', author='Jane Smith', isbn=67890,
 * isBorrowed=false}
 * 
 * 1. Borrow a book
 * 2. Return a book
 * 3. Exit
 * Enter your choice: 3
 * Exiting...
 */