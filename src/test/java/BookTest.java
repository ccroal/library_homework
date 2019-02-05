import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Less Than Zero", "Bret Easton Ellis", "Modern Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Less Than Zero", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Bret Easton Ellis", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Modern Fiction", book.getGenre());
    }

}
