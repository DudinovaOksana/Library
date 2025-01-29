import java.util.Locale;

class Magazine extends ReadMaterial implements Readability{
  int issueNumber;
  String month;

  public Magazine(String name, String author, int yearOfPublication, int bookID, String department) {
    super(name, author, yearOfPublication, bookID, department);

  }

  @Override
    public void read() {
    }
  void takeBook(String name, int issueNumber,String month){
    System.out.println(String.format(Locale.US,"Журнал %s #%d от %s месяца выдан",name,issueNumber,month));
  }
}