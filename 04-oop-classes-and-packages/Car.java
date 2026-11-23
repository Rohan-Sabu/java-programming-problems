// toString() Method Implementation

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return year + " " + brand + " " + model;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2023);

        System.out.println("My dream car is a " + myCar);
    }
}