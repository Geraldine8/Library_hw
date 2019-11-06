import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;


    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book1 = new Book ("Carrie", "Stephen king", "Horror");
        book2 = new Book ("The Raven", "Edgr Allan Poe", "Poem");
        book3 = new Book ("The Shinning", "Stephen King", "Horror");
        book4 = new Book ("The Picture of Dorian Gray", "Oscar Wilde", "Gothic Fiction");
        library.addBook(book1);

    }

    @Test
    public void borrowerTakesBook(){
        borrower.borrowsBook(library, book1);
        assertEquals(1, borrower.collectionSize());
    }



}
