import java.util.Scanner;

class SkipOddNumber {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your number : ");
          int number= sc.nextInt();
          for (int i=1;i<=number;i++){
              if (i%2==1){
                  continue;
              }
              System.out.println(i);
          }
      }
}
