import java.util.ArrayList;
import java.util.Scanner;

class new_array {
    public static ArrayList<int[]>newArray(int[]arr,int[]deleteElement){
        ArrayList<int[]>resultList=new ArrayList<>();
        ArrayList<Integer>elementToDelete=new ArrayList<>();
        int i=0;
        while (i<deleteElement.length){
            elementToDelete.add(deleteElement[i]);
            i++;
        }

        ArrayList<Integer>filterList=new ArrayList<>();
        int j=0;
        while (j<arr.length){
            if (!elementToDelete.contains(arr[j])){
                filterList.add(arr[j]);
            }
            j++;
        }
        int[]filterArray=new int[filterList.size()];
        int k=0;
        while (k<filterList.size()){
            filterArray[k]=filterList.get(k);
            k++;
        }
        resultList.add(filterArray);
        return resultList;
    }

       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter your size : ");
           int size=sc.nextInt();
           int[]array=new int[size];
           int i=0;
           while (i<array.length){
               System.out.print("Enter your element no "+(i+1)+" : ");
               array[i]= sc.nextInt();
               i++;
           }
           System.out.print("Enter the number of element you want to delete : ");
           int deleteSize=sc.nextInt();
           int[]deleteElement=new int[deleteSize];
           int j=0;
           while (j<deleteElement.length){
               System.out.print("Element no "+(j+1)+" : ");
               deleteElement[j]= sc.nextInt();
               j++;
           }
           ArrayList<int[]>resultArray=newArray(array,deleteElement);
           System.out.print("New array : ");
           int k=0;
           while (k<resultArray.size()){
               int[]result=resultArray.get(k);
               int n=0;
               while (n<result.length){
                   System.out.println(result[n]+(j<result.length-1?"," : ""));
                   n++;
               }
               k++;
           }

       }
}
