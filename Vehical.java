class Vehicle {
     String brand;
    String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}
