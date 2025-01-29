

class Book extends ReadMaterial implements Readability{

    public Book(String name,String author,int yearOfPublication,int bookID,String department){
        super(name,author,yearOfPublication,bookID,department);

    }

    @Override
    public void read() {

    }
    @Override
    public String toString(){
        return name + " " + author+" "+String.valueOf(yearOfPublication) + " " + String.valueOf(bookID) + " " + department;
    }
}