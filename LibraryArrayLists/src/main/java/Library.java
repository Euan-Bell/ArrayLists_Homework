import java.util.ArrayList;

public class Library {

   private ArrayList<Books> books;

    public Library(){ this.books = new ArrayList<>();}


    public int countBooks() {
        return this.books.size();
    }

    public void addBooks(Books books) {
        this.books.add(books);
    }
}
