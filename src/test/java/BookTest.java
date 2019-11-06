import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Raven", "Edgar Allan Poe", "Poem");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Raven", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Edgar Allan Poe", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Poem", book.getGenre());
    }

}
