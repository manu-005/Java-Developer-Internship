public class Book {
    String title;
    String author;
    String isbn;
    boolean isIssued = false;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String toString() {
        return title + " by " + author + " [" + isbn + "] - " + (isIssued ? "Issued" : "Available");
    }
}
