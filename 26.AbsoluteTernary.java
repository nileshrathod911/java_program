import java.util.Scanner;

class AbsoluteTernary {
      public int logic(int num){
            return num>=0?num:-num;
      }

      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your number : ");
            int number=sc.nextInt();
            AbsoluteTernary obj=new AbsoluteTernary();
            int result=obj.logic(number);
            System.out.println(result);
      }
}
