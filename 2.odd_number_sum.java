import java.util.Scanner;

class odd_number_sum {
    public static void oddNumberSum(int number){
        int i=1;
        int sum=0;
        while (i<=number){
            if (i%2==1){
                sum=sum+i;
                System.out.println(sum);
            }
            i++;
        }
    }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter your number : ");
         int userInput= sc.nextInt();
         oddNumberSum(userInput);
     }
}
