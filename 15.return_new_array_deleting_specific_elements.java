import java.util.ArrayList;

class return_new_array_deleting_specific_elements {
    public static int[] DeleteAliments(int[]originalArray,int[]elementsToDelete){
        ArrayList<Integer> elementsList =new ArrayList<>();
        for (int element : elementsToDelete){
            elementsList.add(element);
        }

        ArrayList<Integer> resulList=new ArrayList<>();
        for (int element : originalArray){
            if (!elementsList.contains(element)){
                resulList.add(element);
            }
        }
        int[]resultArray=new int[resulList.size()];
        for (int i=0;i<resulList.size();i++){
            resultArray[i]=resulList.get(i);
        }
        return resultArray;
    }

       public static void main(String[] args) {
           int[]originalArray={10,20,30,40,50};
           int[]elementToDelete={20,30};
           int[]numArray=DeleteAliments(originalArray,elementToDelete);
           System.out.print("original Array : ");
           for(int origArr : originalArray){
               System.out.print(origArr+",");
           }

           System.out.println();

           System.out.print("modified Array : ");
           for (int num : numArray){
               System.out.print(num+",");
           }

       }
}
