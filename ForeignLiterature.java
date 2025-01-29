class ForeignLiterature extends Book{
    String name;
    String author;
    int yearOfPublication;
    int bookID;
    String department;

    public ForeignLiterature(String name, String author, int yearOfPublication, int bookID, String department) {
        super(name, author, yearOfPublication, bookID, department);

    }


    {
        name="Mort";
        author="Terry Pratchett";
        yearOfPublication=1987;
        bookID=590;
        department="Иностранная литература";
    }
    @Override
    public String toString(){
        return name + " " + author+" "+String.valueOf(yearOfPublication) + " " + String.valueOf(bookID) + " " + department;
    }
}