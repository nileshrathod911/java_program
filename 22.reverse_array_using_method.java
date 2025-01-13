import java.util.Scanner;

class reverse_array_using_method {
    public static int[]reverseArrayLogic(int[] arr){
        int i=0;
        int n=arr.length;
        while (i<arr.length/2){
           int swap=arr[i];
           arr[i]=arr[n-i-1];
           arr[n-i-1]=swap;
           i++;
        }
        return arr;
    }

      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your size : ");
          int size=sc.nextInt();
          int[]array=new int[size];
          int i=0;
          while (i<array.length){
              System.out.print("Enter your no "+(i+1)+" : ");
              array[i]= sc.nextInt();
              i++;
          }
          int[]arr=reverseArrayLogic(array);
          int j=0;
          System.out.print("reverse array : ");
          while (j<arr.length){
              System.out.print(arr[j]+" ");
              j++;
          }

      }
}
