import java.util.Scanner;

class simpleCalculator {
      public static int calculatorLogic(int num1, int num2, String symbol){
            return switch (symbol){
                  case "+"->num1+num2;
                  case "-"->num1-num2;
                  case "*"->num1*num2;
                  case "/"->num1/num2;
                default -> throw new IllegalStateException("Unexpected value: " + symbol);
            };
      }

      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your first number : ");
            int firstNumber= sc.nextInt();
            System.out.print("Enter your symbol one of them (+,-,*,/) : ");
            String symbol= sc.next();
            System.out.print("Enter your second number : ");
            int secondNumber= sc.nextInt();
            String getValue=String.valueOf(simpleCalculator.calculatorLogic(firstNumber,secondNumber,symbol));
            System.out.println("Result is : "+getValue);
      }
}
