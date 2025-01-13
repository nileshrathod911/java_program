   class StudentToString {
      String name;
      int age;
      int rollNo;
      String collegeName;
      StudentToString(String name,int age,int rollNo,String collegeName){
             this.name=name;
             this.age=age;
             this.rollNo=rollNo;
             this.collegeName=collegeName;
      }
       public String toString(){
              return " Student details : \n" +
                      " Name : "+name+"\n"+
                      " age : "+age+"\n"+
                      " RollNo : "+rollNo+"\n"+
                      " College Name : "+collegeName;
       }
       public static void main(String[] args) {
              StudentToString Student1 = new StudentToString("Nilesh",24,111,"christ");
               System.out.println(Student1);
       }
}
