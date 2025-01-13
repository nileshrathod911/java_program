import java.util.Scanner;

class sorted_array {
    public static int[] sortedArray(int[]arr){
        int i=0;
        while (i<arr.length){
            int j=0;
           while (j<arr.length-1){
               if (arr[j]>arr[j+1]){
                  int swap=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=swap;
               }
               j++;
           }
           i++;
        }
        return arr;
    }

       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter your size : ");
           int size= sc.nextInt();
           int[]array=new int[size];
           int i=0;
           while (i<array.length){
               System.out.print("Enter your no "+(i+1)+" : ");
               array[i]=sc.nextInt();
               i++;
           }
           int[]arr=sortedArray(array);
           int j=0;
           while (j<arr.length){
               System.out.print(arr[j]+" ");
               j++;
           }
       }
}
