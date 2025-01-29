import java.util.*;

abstract class ReadMaterial {

    String name;
    String author;
    int yearOfPublication;
    int bookID;
    String department;


    public ReadMaterial(String name,String author,int yearOfPublication,int bookID,String department){
        this.name = name;
        this.author = author;
        this.yearOfPublication=yearOfPublication;
        this.bookID=bookID;
        this.department=department;
    }

    void takeBook(String name, int bookID){
        System.out.println(String.format(Locale.US,"Книга %s с номером %s взята",name,bookID));
    }

    @Override
    public String toString(){
        return name + " " + String.valueOf(bookID) + " " + department;
    }

}
