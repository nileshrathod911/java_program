import java.util.Scanner;

class FibonacciRecursion {
    public static int logic(int Position){
        if (Position==1){
            return 0;
        }
        if (Position==2){
            return 1;
        }
        return logic(Position-1)+logic(Position-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number :");
        int number= sc.nextInt();
        for (int i=1;i<=number;i++){
            System.out.print(logic(i)+" ");
        }

    }

}
