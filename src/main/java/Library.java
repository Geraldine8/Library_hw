import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private HashMap<String, Integer> genreCount;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<Book>();
        this.capacity  = capacity;
        this.genreCount = new HashMap<String, Integer>();
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public int checkCollectionSize() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if(this.canAddBook()) {
            this.collection.add(book);
        }
    }

    public boolean canAddBook() {
        return this.capacity > this.checkCollectionSize();
    }


    //Borrower method
    public Book removeBook(Book book){
        this.collection.remove(book);
        return book;
    }
}
