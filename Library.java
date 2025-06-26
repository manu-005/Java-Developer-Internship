import java.util.*;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added.");
    }

    void addUser(User u) {
        users.add(u);
        System.out.println("User added.");
    }

    void showBooks() {
        for (Book b : books) System.out.println(b);
    }

    void showUsers() {
        for (User u : users) System.out.println(u);
    }

    void issueBook(String isbn, int userId) {
        for (Book b : books) {
            if (b.isbn.equals(isbn) && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book issued.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    void returnBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn) && b.isIssued) {
                b.isIssued = false;
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }
}
