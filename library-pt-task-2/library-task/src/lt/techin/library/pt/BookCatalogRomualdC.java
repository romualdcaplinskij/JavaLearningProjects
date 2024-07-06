package lt.techin.library.pt;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookCatalogRomualdC implements BookCatalog {

    ArrayList<Book> catalogRC = new ArrayList<>();


    @Override
    public void addBook(Book book) {
        if (book != null)
            if (!catalogRC.contains(book)) {
                catalogRC.add(book);
            }
//            if (catalogRC.isEmpty())
//                    catalogRC.add(book);
//        for (Book item : catalogRC) {
//            if (item.getIsbn().equals(book.getIsbn()))
//                return;
//            catalogRC.add(book);
//        }
    }

    @Override
    public int getTotalNumberOfBooks() {
        return catalogRC.size();
    }

    @Override
    public void printBookTitles() {
        for (Book book : catalogRC)
            System.out.println(book.getTitle());
    }

    @Override
    public void printTitlesOfBooksPublishedAfter(int i) {
        for (Book book : catalogRC)
            if (book.getPublicationYear() > i) System.out.println(book.getTitle());
    }

    @Override
    public Book getBookByIsbn(String s) {
        for (Book book : catalogRC)
            if (book.getIsbn().equals(s)) return book;
            else throw new BookNotFoundException("Book not found");
        return null;
    }

    @Override
    public List<Book> searchBooksByAuthor(String s) {

        List<Book> newList = new ArrayList<>();
        if (catalogRC.isEmpty()) System.out.println("Book catalog is empty");
        else for (Book book : catalogRC)
            if (book.getAuthor().getName().equals(s)) newList.add(book);
        return newList;
    }

    @Override
    public boolean isBookInCatalog(String s) {
        for (Book book : catalogRC)
            if (book.getIsbn().equals(s)) return true;
        return false;
    }

    @Override
    public boolean isBookAvailable(String s) {
        for (Book book : catalogRC)
            if (book.getIsbn().equals(s) && book.isAvailable()) return true;
        return false;
    }

    @Override
    public double calculateTotalPrice() {
        double priceSum = 0;
        for (Book book : catalogRC) priceSum += book.getPrice();
        return priceSum;
    }

    @Override
    public double calculateAveragePrice() {
        return calculateTotalPrice() / catalogRC.size();
    }

    @Override
    public List<Book> getSortedBooks() {
        return catalogRC.stream().sorted(Comparator.comparing(Book::getPublicationYear)).toList();
    }

    @Override
    public List<Book> searchBooksByTitleContaining(String s) {
//        List<Book> newList = new ArrayList<>();
//        for (Book book : catalogRC) {
//            if (book.getTitle().contains(s)) newList.add(book);
//        }
//        return newList;
        return catalogRC.stream().filter(book -> book.getTitle().contains(s)).toList();
    }

    @Override
    public Book findNewestBookByPublisher(String s) {
        return catalogRC.stream().filter(book -> book.getPublisher().contains(s)).max(Comparator.comparing(Book::getPublicationYear)).orElseThrow();
    }

    @Override
    public List<Book> filterBooks(Predicate<Book> predicate) {
        return catalogRC.stream().filter(predicate).toList();
    }

    @Override
    public Map<String, List<Book>> groupBooksByPublisher() {
        return catalogRC.stream().collect(Collectors.groupingBy(book -> book.getPublisher()));
    }
}
