import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();

        if (age>=10){
            System.out.println("you are adult");
        }else {
            System.out.println("sorry! you are not adult");
        }
    }
}