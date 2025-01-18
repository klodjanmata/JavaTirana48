package JavaAdvanced.Exercises.Collections.Task2;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService(BookTestData.createBooks());
        bookService.printAllBooks();
        bookService.orderByTitle();
        System.out.println("\n\n\n\nrdered Books by Title");
        bookService.printAllBooks();
    }
}
