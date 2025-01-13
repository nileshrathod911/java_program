package challange52;

public class Calculate {

    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }
}
 class test extends Calculate{
     public static void main(String[] args) {
         test test=new test();
         System.out.println(test.add(10,20));
         System.out.println(test.add(10,20,30));
         System.out.println(test.add(10.5,10.5));
     }
 }
