import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Books books;

    @Before
    public  void before(){
        library = new Library();
        books = new Books();
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBooks(){
        library.addBooks(books);
        assertEquals(1,library.countBooks());

    }

    @Test
    public void canCheckCapacity(){
        library.checkCapacity(books);
        assertEquals(1, library.countBooks());
    }
}
