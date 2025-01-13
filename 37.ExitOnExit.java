
import java.util.Scanner;
class ExitOnExit {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          while (true){
              System.out.print("Enter your command : ");
              String input= sc.next();
              if (input.equals("exit")){
                  break;
              }
          }
          System.out.println("You have successfully exited.");
      }
}
