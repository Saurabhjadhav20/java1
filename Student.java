public class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student(123, "Saurabh");
        student1.setGrade(95);
        student1.setGrade(110); 

        student1.displayDetails();
    }
}