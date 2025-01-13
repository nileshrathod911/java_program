package challenge43.utils;
import challenge43.geometry.Rectangle;
import challenge43.geometry.circle;

public class main {
    public static void main(String[] args) {
        // Create shapes
        Rectangle rectangle = new Rectangle(4, 6);
        circle circle=new circle(5);

        // Compute areas
        double circleArea = Calculator.computeCircleArea(circle);
        double rectangleArea = Calculator.computeRectangleArea(rectangle);

        // Display results
        System.out.println("Area of the Circle: " + circleArea);
        System.out.println("Area of the Rectangle: " + rectangleArea);
    }
}
