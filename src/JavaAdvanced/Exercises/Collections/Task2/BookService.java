package JavaAdvanced.Exercises.Collections.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> bookList;

    public BookService() {
        bookList = new ArrayList<>();
    }
    public BookService(List<Book> books){
        this.bookList = books;
    }

    public void add(Book book){
        bookList.add(book);
    }

    public boolean remove(Book b){
        return bookList.remove(b);
    }

    public List<Book> getByGenre(Genre genre){
        List<Book> booksToReturn = new ArrayList<>();
        for (Book b : bookList){
            if (b.getGenre() == genre){
                booksToReturn.add(b);
            }
        }
        return booksToReturn;
        //return bookList.stream().filter(b -> b.getGenre() == g).collect(Collectors.toList());
    }

    public List<Book> getByRelease(int yearOfRelease){
        List<Book> booksToReturn = new ArrayList<>();
        for(Book b : bookList){
            if (b.getYearOfRelease() < yearOfRelease){
                booksToReturn.add(b);
            }
        }
        return booksToReturn;
    }

    public Book getTheCheapest(){
        if (bookList.isEmpty()){
            return null;
        }
        Book cheapest = bookList.get(0);
        for (Book b : bookList){
            if (b.getPrice() < cheapest.getPrice()){
                cheapest = b;
            }
        }
        return cheapest;
    }

    public Book getTheMostExpensive(){
        if (bookList.isEmpty()){
            return null;
        }
        Book expensive = bookList.get(0);
        for (Book b : bookList){
            if (b.getPrice() > expensive.getPrice()){
                expensive = b;
            }
        }
        return expensive;
    }

    public Book getBookBy3Authors(){
        if(bookList.isEmpty()){
            return null;
        }
        for (Book b : bookList){
            if (b.getAuthors().size() == 3){
                return b;
            }
        }
        return null;
    }

    public boolean isOnTheList(Book b){
        return bookList.contains(b);
    }

    public List<Book> getBooksByAuthor(Author author){
        List<Book> booksToReturn = new ArrayList<>();
        for(Book b : bookList){
            if(b.getAuthors().contains(author)){
                booksToReturn.add(b);
            }
        }
        return booksToReturn;
    }

    public void printAllBooks(){
        for (Book b : bookList){
            System.out.println(b);
        }
    }

    //Homework
    public void orderByTitle(){

    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
