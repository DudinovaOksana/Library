import java.util.*;

abstract class ReadMaterial {

    String name;
    int yearOfPublication;
    int bookID;
    String department;
    void takeBook(String name, int bookID){
        System.out.println(String.format(Locale.US,"Книга %s с номером %s взята",name,bookID));
    }

    @Override
    public String toString(){
        return name + " " + String.valueOf(bookID) + " " + department;
    }

}
