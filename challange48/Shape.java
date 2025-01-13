package challange48;

  abstract class Shape {
     abstract double calculateArea();
}
class Circle extends Shape{

    double radius;
     Circle(double radius){
         this.radius=radius;
     }
    @Override
    double calculateArea() {
        return radius=Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
     double side;
     Rectangle(double side){
         this.side=side;
     }

    @Override
    double calculateArea() {
        return side*side;
    }
}
    class test{
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        Rectangle rectangle=new Rectangle(3);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
    }
}

