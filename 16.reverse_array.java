import java.util.Scanner;

class reverse_array {
      public static void main(String[] args) {
          int[]arr={1,2,3,4,5,6,7,8,9,10};
          int n=arr.length;
          for (int i=0;i<n/2;i++){
             int swap=arr[i];
             arr[i]=arr[n-1-i];
             arr[n-1-i]=swap;
          }
          for (int reverseArray : arr){
              System.out.print(reverseArray+",");
          }
      }
}
