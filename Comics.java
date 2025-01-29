import java.util.Locale;

public class Comics extends Book implements Readability{
    String genre="Комиксы";
    Boolean isWeb;
    String country;

    Comics(String name, String author, int yearOfPublication, int bookID, String department,String genre,Boolean isWeb, String country){
        super(name, author, yearOfPublication, bookID, department,genre);
        this.isWeb=isWeb;
        this.country=country;
    }


    void takeBook(String name, int bookID){
        System.out.println(String.format(Locale.US,"Комикс %s с номером %s взят",name,bookID));
    }
    @Override
    public void read() {

    }
}
