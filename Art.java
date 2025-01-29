public class Art extends Book {
    public static String barocco="Искусство эпохи барокко";
    public static String renaissance ="Искусство эпохи ренессанс";
    public static String modernArt="Современное искусство";
    Art(String name, String author, int yearOfPublication, int bookID, String department,String genre,Boolean isWeb, String country){
        super(name, author, yearOfPublication, bookID, department);
        this.barocco=barocco;
        this.renaissance=renaissance;
        this.modernArt=modernArt;
    }
    public static void printDescriptionBar(){
        System.out.println(barocco);
    }
    public static void printDescriptionRen(){
        System.out.println(renaissance);
    }
    public static void printDescriptionMod(){
        System.out.println(modernArt);
    }
}
