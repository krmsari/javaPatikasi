package Java101.HarmonicAverage;

public class Average {

    public double cal(){
        int[] numbers = {1, 2, 3, 4, 5};
        int count = numbers.length;
        double total = 0;
        /* n/E(1/n) */
        for (double number : numbers) {
            total += 1/number;
        }
        return count/total;
    }
}
