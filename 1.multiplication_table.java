import java.util.Scanner;

class multiplication_table {
     public static void printMultiplicationTable(int inputNumber){
          int i=1;
          while (i<=10){
               System.out.println(inputNumber + " X " + i + " = " + (inputNumber*i));
               i++;
          }
     }

     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your number : ");
          int number= sc.nextInt();
          printMultiplicationTable(number);
     }

}
