import java.util.Scanner;

class calculate_factorial_num {
    public static long calculateFactorial(int number){
        if (number<1){
            return 0;
        }
        long fact=1;
        int i=2;
        while (i<=number){
            fact=fact*i;
            i++;
        }
        return fact;
    }

       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter your number : ");
           int num= sc.nextInt();
           long factorial=calculateFactorial(num);
           System.out.println("result is : " + factorial);
       }
}
