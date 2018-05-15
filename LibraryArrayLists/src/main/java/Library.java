import java.util.ArrayList;

public class Library {

    ArrayList<Library> books;

    public Library(){ this.books = new ArrayList<>();}


    public int countBooks() {
        return this.books.size();
    }
}
