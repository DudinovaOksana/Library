import java.util.*;

class Book extends ReadMaterial implements Readability{
    String author;
    String genre;
    public Book(String name,String author,int yearOfPublication,int bookID,String department, String genre){
        this.name = name;
        this.author = author;
        this.yearOfPublication=yearOfPublication;
        this.bookID=bookID;
        this.department=department;
        this.genre = genre;
    }
    public Book(){

    }

    @Override
    public void read() {

    }
    @Override
    public String toString(){
        return name + " " + author+" "+String.valueOf(yearOfPublication) + " " + String.valueOf(bookID) + " " + department;
    }
}