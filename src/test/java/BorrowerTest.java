import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book("Less Than Zero", "Bret Easton Ellis", "Modern Fiction");
        borrower = new Borrower();
        library = new Library(2);
        library.addBook(book);
    }

    @Test
    public void hasCollection(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.collectionCount());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library, 0);
        assertEquals(1, borrower.collectionCount());
        assertEquals(0, library.collectionCount());
    }
}
