class Reader extends Person{
    String readerFullName;
    String dateOfBirth;
    int readerID;
    public static int numberOfReader=0;
    public Reader(String readerFullName,String dateOfBirth,int readerID){
        this.readerFullName = readerFullName;
        this.dateOfBirth = dateOfBirth;
        this.readerID = readerID;
        numberOfReader++;
    }
    @Override
    public String toString(){
        return readerFullName + " " + dateOfBirth+" "+String.valueOf(readerID) + " " + String.valueOf(numberOfReader);
    }
}