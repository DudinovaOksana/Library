public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.libraryName = "Маяковка";
        lib.bookList.add(new Book("Приключения Тома Соера","М.Твен",1991,1234,"Отдел иностранной литературы"));
        lib.stufList.add(new Staff("Вася Пупкин","Абонемент",1,"11.01.1989"));
        lib.readersList.add(new Reader("Марк Петров","12.03.2000",3));
        lib.libraryDepartment.add("Абонемент");
        lib.display();
        Art.printDescriptionBar();
        Comics comics = new Comics("Истребитель демонов","Готогэ Коёхару",2023,345,"Комиксы","Манга",Boolean.FALSE,"Япония");
        comics.takeBook("Истребитель демонов",345);
        Fiction fiction = new Fiction("Цвет волшебства","Тэрри Пратчер",1998,2345,"Абонемент","Художественная литература");
        System.out.println(fiction);
        ForeignLiterature fore = new ForeignLiterature("Mort", "Terry Pratchett", 1987, 590, "Иностранная литература");
        System.out.println(fore);
        Magazine magazine = new Magazine("Burda","-",2023,564,"Периодические издания");
        magazine.takeBook("Burda",12,"ноябрь");
        Reader reader = new Reader("Петров Петр Петрович", "01.02.2010", 484);
        System.out.println(reader);
        ScientificLiterature sc = new ScientificLiterature("Основоположник Махаяны Нагарджуна и его труды","В.П.Андросов", 2024, 452,"Научная литература");
        System.out.println(sc);

    }
}
