import java.util.Scanner;

class findOutMaximumValueInArray {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your Array Size : ");
          int size= sc.nextInt();
          int[]array=new int[size];
          for (int i=0;i<array.length;i++){
               System.out.print("Enter your "+(i+1)+" No : ");
               array[i]=sc.nextInt();
          }
          int max=Integer.MIN_VALUE;
          int min=Integer.MAX_VALUE;
          for (int arr:array){
               if (arr>max){
                   max=arr;
               }
               if (arr<min){
                    min=arr;
               }
          }
          System.out.println("Maximum number is : "+ max);
          System.out.println("Minimum number is : "+min);
     }
}
