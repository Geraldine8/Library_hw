import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before(){
        library = new Library(4);
        book1 = new Book ("Carrie", "Stephen king", "Horror");
        book2 = new Book ("The Raven", "Edgr Allan Poe", "Poem");
        book3 = new Book ("The Shinning", "Stephen King", "Horror");
        book4 = new Book ("The Picture of Dorian Gray", "Oscar Wilde", "Gothic Fiction");
        book5 = new Book ("IT", "Stephen King", "Horror");

    }

    @Test
    public void checkCapacity(){
        assertEquals(4, library.checkCapacity());
    }

    @Test
    public void libraryHasNoBook(){
        assertEquals(0, library.checkCollectionSize());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.checkCollectionSize());
    }

    @Test
    public void cannotAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(false, library.canAddBook());

    }



}
