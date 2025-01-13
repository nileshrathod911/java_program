import java.util.Scanner;

class findMinimumOfTwoNumber {

    public int min(int num_1,int num_2) {
        int logic = num_1 < num_2 ? num_1 : num_2;
        return logic;
    }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter your first number : ");
         int firstNumber= sc.nextInt();
         System.out.print("Enter your second number :  ");
         int secondNumber= sc.nextInt();
         findMinimumOfTwoNumber obj=new findMinimumOfTwoNumber();
         int result=obj.min(firstNumber,secondNumber);
        // int result=findMinimumOfTwoNumber.min(firstNumber,secondNumber);
         System.out.println("Minimum number is : "+result);
     }
}
