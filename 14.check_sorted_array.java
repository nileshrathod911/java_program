import java.util.Arrays;

class check_sorted_array {
      public static void main(String[] args) {
          int[]array={10,57,30,40,3,7,90,1};
          for (int i=0;i<array.length;i++){
              for (int j=0;j<array.length-i-1;j++){
                  if (array[j]>array[j+1]){
                      int swap=array[j];
                      array[j]=array[j+1];
                      array[j+1]=swap;
                  }
              }
          }
          for (int arr : array){
              System.out.println(arr+" ");
          }
      }
}
