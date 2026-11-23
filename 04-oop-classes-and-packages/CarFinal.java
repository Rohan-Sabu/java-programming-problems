// Create an object with final fields and a constructor to initializ them.

public class CarFinal {

    final int noOfWheels;
    final String model;
    final String engineInLiters;

    public CarFinal(int noOfWheels, String model, String engineInLiters) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
        
    }

    public static void main(String[] args) {
        CarFinal myCar = new CarFinal(4, "Sedan", "2.0L");
        
        System.out.println("Model: " + myCar.model);
        System.out.println("Wheels: " + myCar.noOfWheels);
        System.out.println("Engine: " + myCar.engineInLiters);
    }
}