package challenge43.utils;
import challenge43.geometry.circle;
import challenge43.geometry.Rectangle;

public class Calculator {
    public static double computeCircleArea(circle circle){
        return Math.PI*circle.getRadius()*circle.getRadius();
    }
    public static double computeRectangleArea(Rectangle rectangle){
        return rectangle.getLength()*rectangle.getWidth();
    }

}
