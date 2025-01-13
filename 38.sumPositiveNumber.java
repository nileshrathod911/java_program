import java.util.Scanner;

class sumPositiveNumber {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your size : ");
            int size= sc.nextInt();
            int[]array=new int[size];
            for (int i=0;i<array.length;i++){
                  System.out.print("Enter your "+(i+1)+" No :");
                  array[i]= sc.nextInt();
            }
            int sum=0;
            for (int arr:array){
                  if (arr<0){
                        continue;
                  }
                  while (arr>0){
                        arr++;
                       sum=sum+arr;
                       arr=arr/10;
                  }
                 // sum=sum+arr;
            }
            System.out.println("The sum of array is : "+sum);
      }
}
