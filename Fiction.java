import java.util.*;

public class Fiction extends Book {
    String genre = "Художественная литература";

    public Fiction(String name, String author, int yearOfPublication, int bookID, String department, String genre) {
        super(name, author, yearOfPublication, bookID, department, genre);
    }

    @Override
    public String toString() {
        return name + " " + author + " " + String.valueOf(yearOfPublication) + " " + String.valueOf(bookID) + " " + department;
    }
}
