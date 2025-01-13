import java.util.Scanner;

class passwordChecker {
    public static boolean isValid(String pass){
        return pass.length()>6;
    }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String password;
         do {
             System.out.print("Enter your password : ");
             password=sc.next();
         }while (!isValid(password));{
             System.out.println("Thanks for entering valid password");
         }

     }
}
