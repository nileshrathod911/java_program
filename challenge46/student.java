package challenge46;

public class student {
    public static void main(String[] args) {
        studentManagementSystem student=new studentManagementSystem("Nilesh Rathod",
                101,
                24,'A');

        student.printStudentDetails();
        student.setGetStudentAge(20);
        student.setStudentGrade('B');

        System.out.println("\nUpdated student details:");
        student.printStudentDetails();

        student.setGetStudentAge(-1);
        System.out.println("\nUpdated student details:");
        student.printStudentDetails();
        student.printStudentDetails();


    }
}
