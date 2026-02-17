import java.util.ArrayList;

public class LibraryManagement {
    public static void main(String[] args) {

        Library library = new Library();

        // Adding books
        library.addBook(new Book("Atomic Habits", "James Clear", "1111"));
        library.addBook(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "2222"));
        library.addBook(new Book("The Alchemist", "Paulo Coelho", "3333"));

        // Display all books
        System.out.println("All Books:");
        library.displayAllBooks();

        // Search by title
        System.out.println("\nSearching for 'Atomic Habits':");
        Book found = library.searchByTitle("Atomic Habits");

        if (found != null) {
            System.out.println("Book Found:");
            System.out.println(found);
        } else {
            System.out.println("Book not found.");
        }
    }
}

class Book {
    String title;
    String author;
    String isbn;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // toString method for easy printing
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    // Add book
    void addBook(Book book) {
        books.add(book);
    }

    // Search by title
    Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Display all books
    void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
