package JavaAdvanced.Exercises.Collections.Task2;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService(BookTestData.createBooks());
        bookService.printAllBooks();
    }
}
