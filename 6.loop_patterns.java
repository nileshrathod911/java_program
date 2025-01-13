import java.util.Scanner;

class loop_patterns_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your row number : ");
        int rows= sc.nextInt();
        patternLogic(rows);
    }
      public static void patternLogic(int row) {
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
      }
}
