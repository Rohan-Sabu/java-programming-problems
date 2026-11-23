package Packages.Utils;

import Packages.Geometry.Circle;
import Packages.Geometry.Rectangle;

public class AreaCalculator{

    public static void main(String[] args) {
        
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(3, 4);

        double CirArea = Math.PI * Math.pow(c1.radius, 2);
        double RecArea = r1.length * r1.breadth;

        System.out.printf("Area of circle is: %.2f\nArea of Reactangle is: %.2f" , CirArea, RecArea);
    }
}