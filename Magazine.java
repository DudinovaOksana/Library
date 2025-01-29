import java.util.Locale;

class Magazine extends ReadMaterial implements Readability{
  int issueNumber;
  String month;
    @Override
    public void read() {
    }
  void takeBook(String name, int issueNumber,String month){
    System.out.println(String.format(Locale.US,"Журнал %s #%d от %s месяца выдан",name,issueNumber,month));
  }
}