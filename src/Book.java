import java.util.ArrayList;
import java.util.List;

public class Book {
    public String title;
    public String author;
    public String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the library: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library: " + book.getTitle());
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getISBN() + ")");
        }
    }
}

