import java.util.Random;
import java.util.Scanner;

class numberGuessingGame {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           Random random = new Random();
           int numberToGuess = random.nextInt(100) + 1;
           int userGuess;
           int attempt = 0;
           Boolean guessCorrectly=false;
           System.out.println("Welcome to guessing number Game.");
           do {
               System.out.print("Enter your Guess between 0 to 100 : ");
               userGuess = sc.nextInt();
               attempt++;
               if (userGuess > numberToGuess) {
                   System.out.println("Too high! Try again.");
               } else if (userGuess < numberToGuess) {
                   System.out.println("Too Low! Try again.");
               } else {
                   guessCorrectly = true;
                   System.out.println("Congratulation! you got the number in " + attempt + " attempts");
               }
       }while (!guessCorrectly);{
               System.out.println("Thank You for Playing...");
               sc.close();
           }
    }

}
