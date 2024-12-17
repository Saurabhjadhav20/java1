class Vehicle {
    protected String brand;
    protected String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String color, int numDoors) {
        super(brand, color);
        this.numDoors = numDoors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Bike extends Vehicle {
    private String engineType;

    public Bike(String brand, String color, String engineType) {
        super(brand, color);
        this.engineType = engineType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + engineType);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red", 4);
        Bike bike = new Bike("Honda", "Black", "Petrol");

        car.displayInfo();
        System.out.println();
        bike.displayInfo();
    }
}