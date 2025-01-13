import java.util.Scanner;

class sum_of__digits {
       public static int sumOfDigits(int num){
           int sum=0;
           while (num>0){
               sum=sum+num%10;
               num=num/10;
           }
           return sum;
       }

        public static void main(String[] args) {
            System.out.print("Enter your Number : ");
            Scanner sc=new Scanner(System.in);
            int number= sc.nextInt();
            int sum=sumOfDigits(number);
            System.out.println("the sum of number : "+number+ " is = " +sum);
        }
}
