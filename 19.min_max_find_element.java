import java.util.Scanner;

class min_max_find_element {
       public static int minNumberLogic(int[] arr){
              int min=Integer.MAX_VALUE;
              int i=0;
              while (i<arr.length){
                     if (arr[i]<min){
                            min=arr[i];
                    }
                    i++;
              }
              return min;
       }
       public static int maxNumberLogic(int[]arr){
              int max=Integer.MIN_VALUE;
              int i= 0;
              while (i<arr.length){
                    if (arr[i]>max){
                           max=arr[i];
                     }
                     i++;
              }
              return max;
       }

       public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter your array size : ");
              int size= sc.nextInt();
              int []array=new int[size];
              int i=0;
              while (i<array.length){
                     System.out.print("Enter your element no "+(i+1)+" :");
                     array[i]=sc.nextInt();
                     i++;
              }
              int min=minNumberLogic(array);
              int max=maxNumberLogic(array);
              System.out.println("min number is : "+min);
              System.out.println("max number is : "+max);
       }
}
