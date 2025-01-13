import java.util.Scanner;

class multiplicationTable {
    public static void logicMul(int num){
        int mul=0;
        for (int i=1;i<=num;i++){
            mul=num*i;
            System.out.println(num+" X "+i+" = "+mul);
        }
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter your number : ");
         int number= sc.nextInt();
//         int mul=0;
//         for (int i=1;i<=number;i++){
//             mul=number*i;
//             System.out.println(number+" X "+i+" = "+mul);
//         }
         logicMul(number);

     }
}
