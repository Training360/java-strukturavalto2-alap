package lambdastreams.bookstore;

import java.util.List;
import java.util.Optional;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public Integer getNumberOfBooks() {
        return books.stream().reduce(0, (a, b) -> a + b.getPieces(), (x, y) -> x + y);
    }

    public Optional<Book> findNewestBook() {
        return books.stream().max((a, b) -> a.getYearOfPublish() - b.getYearOfPublish());
    }

    public Integer getTotalValue() {
        return books.stream().reduce(0, (a, b) -> a + b.getPrice() * b.getPieces(), (x, y) -> x + y);
    }
}
