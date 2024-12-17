
 class Main3 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red",4);
        Bike bike = new Bike("Honda", "Black", "Shine");

        car.displayInfo();
        System.out.println();
        bike.displayInfo();
    }
}