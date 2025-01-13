import java.util.Scanner;

class numberOccurrencesInArray {
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
              System.out.print("Enter your Array size : ");
              int size=sc.nextInt();
              int[]array=new int[size];
              for (int i=0;i<array.length;i++){
                     System.out.print("Enter your "+(i+1)+" No : ");
                     array[i]= sc.nextInt();
              }
              System.out.print("Enter your number : ");
              int number=sc.nextInt();
              int count=0;
              for (int arr:array){
                     if (arr==number){
                            count++;
                     }
              }
              System.out.println("Your number was occurred "+count+" Times.");
       }
}
