  class find_The_sum_and_average_in_array {
      public static void main(String[] args) {
          int[]marks={50,88,47,100,75};
          int sum=0;
          double average=0;
          for (int i=0;i<marks.length;i++){
              sum+=marks[i];
          }
          average=(double) sum/marks.length;
          System.out.println("the sum of array elements : "+sum);
          System.out.println("the average of array elements : "+average);
      }
}
