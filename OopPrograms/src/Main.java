public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);
        Manager manager = new Manager("Jane Smith", 60000, 10000);

        System.out.println("Employee Bonus: $" + employee.calculateBonus());
        System.out.println("Manager Bonus: $" + manager.calculateBonus());
    }
}