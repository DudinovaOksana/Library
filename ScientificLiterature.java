final class ScientificLiterature extends Book{
    static String genre = "Научная литература";
    public ScientificLiterature(String nameBook, String authorBook, int yearOfPublication, int id, String department){
        super(nameBook,authorBook, yearOfPublication, id, department);

    }
    @Override
    public String toString(){
        return name + " " + author+" "+String.valueOf(yearOfPublication) + " " + String.valueOf(bookID) + " " + department;

    }
}