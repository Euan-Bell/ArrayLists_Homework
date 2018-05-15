import java.util.ArrayList;

public class Library {

   private ArrayList<Books> books;
   private Integer capacity;

    public Library(){
        this.books = new ArrayList<>();
        this.capacity = 6;
    }


    public int countBooks() {
        return this.books.size();
    }

    public void addBooks(Books books) {
        this.books.add(books);
    }

    public void checkCapacity(Books books) {
        if (this.countBooks() < capacity)
         this.books.add(books);
    }
}
