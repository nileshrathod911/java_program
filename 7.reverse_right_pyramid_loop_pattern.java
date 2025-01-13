import java.util.Scanner;

class loop_pattern_7 {
    public static void patternLogic(int row){
        for (int i=row;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your row number : ");
          int row_number= sc.nextInt();
          patternLogic(row_number);
      }
}
