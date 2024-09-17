package mathutils;

public class Average {
    /**
     * Calculates the average of the given array of doubles.
     *
     * @param numbers Array of double values
     * @return The average of the input array values
     */
    public static double calculate(double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
