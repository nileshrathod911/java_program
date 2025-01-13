
import java.util.Scanner;

class monthYear {
       public static String getMonthName(int monthNum){
              return switch (monthNum){
                     case 1 ->"January";
                     case 2 ->"February";
                     case 3 ->"March";
                     case 4 ->"April";
                     case 5 ->"May";
                     case 6 ->"Jun";
                     case 7 ->"July";
                     case 8 ->"August";
                     case 9 ->"September";
                     case 10->"October";
                     case 11->"November";
                     case 12->"December";
                  default -> "Please Enter number between 1 to 12";
              };
       }
       public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter your month number : ");
              int monthNumber= sc.nextInt();
              String monthName=monthYear.getMonthName(monthNumber);
              System.out.println(monthName);
       }
}
