import java.util.List;

public class AdvancedCalculator extends Calulator {
    public double add(List<Integer> numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
