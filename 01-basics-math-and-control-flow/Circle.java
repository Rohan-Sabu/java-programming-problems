import java.util.Scanner;

public class Circle{

    double radius;

    Circle(double r){
        radius = r;
    }

    double circumference(){
        return 2 * Math.PI * radius; 
    }

    double area(){
        return Math.PI * Math.pow(radius,2);
    }

    public String toString(){
        return "Circle { Radius: " + radius + " cm, Circumference: " + circumference() + " cm, Area : " + area() + " cm }";  
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculation of Circumference and Area of Circle");
        System.out.print("Enter radius in cm: ");
        double radius = sc.nextDouble();
        
        Circle c1 = new Circle(radius);
        System.out.println(c1);
        sc.close();
    }
}