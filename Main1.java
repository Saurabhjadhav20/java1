import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Calulator calculator = new Calulator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 4));
        System.out.println(calculator.add(2.5, 3.5));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(advancedCalculator.add(numbers));
    }
}