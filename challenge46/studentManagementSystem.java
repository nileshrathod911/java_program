package challenge46;

public class studentManagementSystem {
    private String studentName;
    private int studentId;
    private int getStudentAge;
    private char studentGrade;

    studentManagementSystem(String studentName,int studentId,int getStudentAge,char studentGrade){
        this.studentName=studentName;
        this.studentId=studentId;
        this.getStudentAge=getStudentAge;
        this.studentGrade=studentGrade;
    }

    public void setStudentName(String name){
        this.studentName=name;
    }
    public String getStudentName(){
        return studentName;
    }

    public void setStudentId(int id){
        this.studentId=id;
    }
    public int getStudentId(){
        return studentId;
    }

    public void setGetStudentAge(int age){
       if (age>0){
           this.getStudentAge=age;
       }else {
           System.out.println("Invalid age!");
       }
    }
    public int getGetStudentAge(){
        return getStudentAge;
    }

    public void setStudentGrade(char grade){
        this.studentGrade=grade;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public void printStudentDetails(){
        System.out.println("Student Name : "+studentName);
        System.out.println("age :"+getStudentAge);
        System.out.println("Id : "+studentId);
        System.out.println("Grade : "+studentGrade);
    }


}
