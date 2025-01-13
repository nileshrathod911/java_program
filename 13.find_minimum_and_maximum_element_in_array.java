  class find_minimum_and_maximum_element_in_array {
      public static void main(String[] args) {
          int[]array={30,60,40,100,400,10,5};
          int max=array[0];
          int min=array[0];
          for (int i=0;i< array.length;i++){
              if (array[i]<min){
                  min=array[i];
              }
              if (array[i]>max){
                  max=array[i];
              }
          }
          System.out.println("The maximum element in the array : "+max);
          System.out.println("The minimum element in the array : "+min);
      }
}
