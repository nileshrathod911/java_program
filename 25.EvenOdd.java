import java.util.Scanner;

class EvenOdd {
      public String oddEvenLogic(int num){
          // System.out.println(logic);
//            if (num%2==0) {
//                  System.out.println("Even");
//            }else {
//                  System.out.println("odd");
//            }
            return num%2==0?"Even":"odd";
     }

      
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your number : ");
            int Number= sc.nextInt();
            EvenOdd obj=new EvenOdd();
            String result=obj.oddEvenLogic(Number);
            System.out.println(result);

      }
}
