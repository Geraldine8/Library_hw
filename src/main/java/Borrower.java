import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int collectionSize(){
        return this.collection.size();
    }

    public void borrowsBook(Library library, Book book) {
        this.collection.add(library.removeBook(book));
    }
}
