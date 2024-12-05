package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Remove a book by ISBN
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book with ISBN " + isbn + " removed.");
    }

    // View all books
    public void viewBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Add a new user
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    // View all users
    public void viewUsers() {
        System.out.println("Users in the System:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    // Borrow a book
    public void borrowBook(String isbn, int userId) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book borrowed by user ID: " + userId);
                return;
            }
        }
        System.out.println("Book is either unavailable or not found.");
    }

    // Return a book
    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setAvailable(true);
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }
}

