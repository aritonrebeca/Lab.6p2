public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        Book book3 = new Book("1984", "George Orwell", "978-0-452-28423-4");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.removeBook(book2);

        library.displayBooks();
    }
}
