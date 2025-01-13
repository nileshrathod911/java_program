import java.util.Scanner;

class find_number_of_occurrences_in_array {
      public static void main(String[] args) {
          int[]elements={10,33,70,77,33,99,99,99,32};
          int count=0;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your number : ");
          int number= sc.nextInt();
          for (int element : elements){
              if (element==number){
                 count++;
              }
              }
          if (count>0){
              System.out.println("The number "+number+" occurs "+count+" times in the array.");
          }else {
              System.out.println("The number "+number+" does not exist in the array.");
          }

      }
}
