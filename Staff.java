class Staff extends Person{
      String fullName;
      String department;
      int ID;
      String dateOfBirth;
      public Staff(String fullName, String department, int ID, String dateOfBirth) {
            this.fullName = fullName;
            this.department = department;
            this.ID = ID;
            this.dateOfBirth = dateOfBirth;
      }
      @Override
      public String toString(){
            return fullName + " " + department+" "+String.valueOf(ID) + " " + dateOfBirth;
      }
}
