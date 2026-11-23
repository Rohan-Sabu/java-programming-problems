import java.util.Scanner;

public class FahrenheitToCelsius{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        float f = sc.nextFloat();

        // Celsius = (Fahrenheit - 32) * 5/9

        float c = ((f - 32) * 5) / 9;
        System.out.print("Temperature in Celsius is: " + c);
        sc.close();
    }
}