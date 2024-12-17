
class Car extends Vehicle {
     int numDoors;

    public Car(String brand, String color, int numDoors) {
        super(brand, color);
        this.numDoors = numDoors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}