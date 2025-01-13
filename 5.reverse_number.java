import java.util.Scanner;

class reverse_number {
       public static int reverseNumber(int number){
           int revers=0;
           int digit=0;
           while (number>0){
               digit=number%10;
               revers=revers*10+digit;
               number=number/10;
           }
           return revers;
       }

        public static void main(String[] args) {
            System.out.print("Enter your Number : ");
            Scanner sc=new Scanner(System.in);
            int number= sc.nextInt();
            int ans=reverseNumber(number);
            System.out.println("Reverse number is : "+ans);
        }
}
