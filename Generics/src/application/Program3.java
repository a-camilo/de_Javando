package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(2.0,3.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }
    public static double totalArea(List<? extends Shape>list){
        double sum = 0.0;
        for (Shape s:list) {
            sum += s.area();
        }
        return sum;
    }
}
