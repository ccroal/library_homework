import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (isFull()) {
            this.collection.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isFull(){
        if(capacity > this.collectionCount()){
            return true;
        }
        return false;
    }

    public Book removeBook(int index) {
        return this.collection.remove(index);
    }

    public int genreCount(String genre) {
        int numOfBooks = 0;
        for (Book book : this.collection){
            if(genre == book.getGenre()){
                numOfBooks += 1;
            }
        }
        return numOfBooks;
    }
}
