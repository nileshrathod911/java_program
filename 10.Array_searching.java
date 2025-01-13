import java.util.Scanner;

class Array_searching {

   public static void FindNumber(int[] arr, int number) {
      boolean found=false;
     for (int index=0;index< arr.length;index++){
        if (arr[index]==number){
           System.out.println("your number was found at index of : "+index);
           found=true;
           break;
        }
     }
     if (!found){
        System.out.println("your number was not found!");
     }
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
      System.out.print("Enter your number : ");
      int number = sc.nextInt();
      FindNumber(arr,number);
   }
}
