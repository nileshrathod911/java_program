import java.util.Scanner;

class recourtionFactorial {
    public static long factorialNumber(int num){
        // long result=1;
        if (num==1){
            return 1;
        }return num*factorialNumber(num-1);


//        for (int i=1;i<=num;i++){
//             result*=i;
//        }
//        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number=sc.nextInt();

        long result=factorialNumber(number);
        System.out.println("Your factorial is : "+result);
    }
}