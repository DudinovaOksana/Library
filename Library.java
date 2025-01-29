import java.util.*;

class Library {
        String libraryName;
        ArrayList<ReadMaterial> bookList = new ArrayList<>();
        ArrayList<Staff> stufList = new ArrayList<>();
        ArrayList<Reader> readersList = new ArrayList<>();
        ArrayList<String> libraryDepartment= new ArrayList<>();


        public void display(){
            System.out.println(String.format(Locale.US,"Название библиотеки: %s, Cписок книг: %s, Сотрудники библиотеки: %s, Список читателей: %s, Отдел: %s",
                    libraryName,
                    bookList,
                    stufList,
                    readersList,
                    libraryDepartment));
        }

        public String getLibraryName(){
            return libraryName;
        }
        public void setLibraryName(String libraryName){
            this.libraryName = libraryName;
        }
        public ArrayList<ReadMaterial> getBookList(){
            return bookList;
        }
        public void setBookList(ArrayList<ReadMaterial> bookList){
            this.bookList = bookList;
        }
        public ArrayList<Staff> getStufList(){
            return stufList;
        }
        public void setStufList(ArrayList<Staff> stufList){
            this.stufList = stufList;
        }
        public ArrayList<Reader> getReadersList(){
            return readersList;
        }
        public void setReadersList(ArrayList<Reader> readersList){
            this.readersList = readersList;
        }
        public ArrayList<String> getLibraryDepartment(){
            return libraryDepartment;
        }
        public void setLibraryDepartment(ArrayList<String> libraryDepartment){
            this.libraryDepartment=libraryDepartment;
        }


    }


