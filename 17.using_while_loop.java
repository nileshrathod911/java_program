import java.util.Scanner;

class practice_program {
    public static long sumMethod(int[]arr){
        int i=0;
        int sum=0;
       while (i<arr.length){
           sum=arr[i]+sum;
           i++;
       }
       return sum;
    }

    public static double average(int []arr){
        int i=0;
        double average=0;
        int sum=0;
        while (i< arr.length){
            sum=sum+arr[i];
            i++;
            average= (double) sum /arr.length;
        }
        return average;
    }

       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter your Size : ");
           int size = sc.nextInt();
           int [] array=new int[size];
           int i=0;
           while (i<size){
               System.out.print("Please enter element no "+(i+1)+" : ");
               array[i]= sc.nextInt();
               i++;
           }
           long sum=sumMethod(array);
           double average=average(array);
           System.out.println("sum of the array is : "+sum);
           System.out.println("average of the array is : "+average);
       }
}
