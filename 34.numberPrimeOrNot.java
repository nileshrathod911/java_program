import java.util.Scanner;

class numberPrimeOrNot {
      public static boolean isPrime(int num){
            for (int i=1;i<=num;i++){
                  if (num%2==0){
                        return false;
                  }
            }
            return true;
      }

      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your number : ");
            int number= sc.nextInt();
            System.out.println("Yor number is "+((isPrime(number))?"prime":"Not Prime"));
      }
}
