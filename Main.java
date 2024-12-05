import library.Book;
import library.Library;
import library.User;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding Books
        Book book1 = new Book("Effective Java", "Joshua Bloch", "123456789");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "987654321");
        library.addBook(book1);
        library.addBook(book2);

        // Adding Users
        User user1 = new User("Alice", 1);
        User user2 = new User("Bob", 2);
        library.addUser(user1);
        library.addUser(user2);

        // View Books and Users
        library.viewBooks();
        library.viewUsers();

        // Borrow and Return Book
        library.borrowBook("123456789", 1);
        library.viewBooks();

        library.returnBook("123456789");
        library.viewBooks();
    }
}

