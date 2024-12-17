class Bike extends Vehicle {
     String nameModel;

    public Bike(String brand, String color, String name) {
        super(brand, color);
        this.nameModel=nameModel;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike Name: " + nameModel);
    }
}
