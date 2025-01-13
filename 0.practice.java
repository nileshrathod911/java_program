import java.util.Scanner;

class A  {
    public static void printName(String name)throws IllegalArgumentException{
        if (name.contains("-")){
            throw new IllegalArgumentException("Name cannot contains '-'");
        }
        System.out.println(name);
    }
    public static void main(String[] args) {
        printName("Nil-esh");
    }
}
