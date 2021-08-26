package JavaRush;

public class Truck extends Car {

    private static int truckCounter = 10;

    private int yearOfManufacture;
    private String model;
    private int maxSpeed = 150;

    public Truck(int yearOfManufacture, String model, int maxSpeed) {

        System.out.println("Изначальное значение maxSpeed = " + this.maxSpeed);
        this.yearOfManufacture = yearOfManufacture;
        this.model = model;
        this.maxSpeed = maxSpeed;

        Car.carCounter++;
        truckCounter++;
    }
}