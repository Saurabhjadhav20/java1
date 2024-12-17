
class Bike {
    void Color() {
        System.out.println("Black color.");
    }
}

class HondaShine extends Bike  {
    void Model() {
        System.out.println("2024 model.");
    }
}

class Fz extends Bike {
    void Model() {
        System.out.println("2023 model.");
    }
}

public class HiracicalDemo {
    public static void main(String[] args) {
       HondaShine c1 = new HondaShine();
        Fz c2 = new Fz();

        c1.Color(); // Parent method
        c1.Model();   // Child1 method

        c2.Color(); // Parent method
        c2.Model(); // Child2 method
    }
}
