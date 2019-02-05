import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        book1 = new Book("Less Than Zero", "Bret Easton Ellis", "Modern Fiction");
        book2 = new Book("Perdido Station", "China Mieville", "Sci-fi");
        book3 = new Book("Life 3.0", "Max Tegmark", "Non-fiction");

        library = new Library(2);
    }

    @Test
    public void hasCollection(){
        assertEquals(0, library.collectionCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.collectionCount());
    }

    @Test
    public void hasCapcity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void isStockFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.collectionCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(0);
        assertEquals(1, library.collectionCount());
    }

    @Test
    public void countGenre(){
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(2, library.genreCount("Modern Fiction"));
    }
}
