import java.util.Scanner;

class number_occurrences {
    public static int occurrencesLogic(int[]arr ,int number){
        int count=0;
        int i=0;
        while (i<arr.length){
            if (number==arr[i]){
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your size : ");
        int size= sc.nextInt();
        int[]array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Enter your element no "+(i+1)+" :");
            array[i]=sc.nextInt();
            i++;
        }
        System.out.print("Enter your number : ");
        int number =sc.nextInt();
        int count=occurrencesLogic(array,number);
        System.out.println("the number "+number+" occurred "+count+" times in the array");

    }
}
