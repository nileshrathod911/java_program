import javax.sql.rowset.serial.SerialStruct;
import java.util.Scanner;

class studentScoreTernary {
     public String logic(int num){
          String category=num>=80?"High":(num>=50?"Moderate":"Low");
          return category;
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your number : ");
          int number= sc.nextInt();
          studentScoreTernary obj=new studentScoreTernary();
          String result=obj.logic(number);
          System.out.println(result);
     }
}
