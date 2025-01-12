package JavaAdvanced.Exercises.Collections.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookTestData {
    public static List<Book> createBooks() {
        List<Author> authorsList = Arrays.asList(
                new Author("John", "Smith", 'M'),
                new Author("Emily", "Johnson", 'F'),
                new Author("Michael", "Williams", 'M'),
                new Author("Sarah", "Jones", 'F'),
                new Author("David", "Brown", 'M'),
                new Author("Emma", "Davis", 'F'),
                new Author("Daniel", "Miller", 'M'),
                new Author("Sophia", "Wilson", 'F'),
                new Author("James", "Taylor", 'M'),
                new Author("Olivia", "Anderson", 'F')
        );

        Genre[] genres = Genre.values();

        List<Book> books = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            String title = "Book Title " + i;
            int price = (int) (Math.random() * 96) + 5; // Random price between 5 and 100
            int yearOfRelease = (int) (Math.random() * (2023 - 1900 + 1)) + 1900; // Random year between 1900 and 2023
            int authorsCount = (int) (Math.random() * 3) + 1; // 1 to 3 authors
            List<Author> authors = new ArrayList<>();
            for (int j = 0; j < authorsCount; j++) {
                authors.add(authorsList.get((int) (Math.random() * authorsList.size())));
            }
            Genre genre = genres[(int) (Math.random() * genres.length)];

            books.add(new Book(title, price, yearOfRelease, authors, genre));
        }

        return books;
    }

    public static void main(String[] args) {
        List<Book> books = createBooks();

        books.forEach(System.out::println);
    }
}
