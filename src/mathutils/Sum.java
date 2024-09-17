package mathutils;

public class Sum {

    /**
     * Calculates the sum of the given array of doubles.
     *
     * @param inputArr Array of double values
     * @return The sum of the input array
     */
    public static double calculate(double[] inputArr) {
        double sum = 0.0;
        for (double num : inputArr) {
            sum += num;
        }
        return sum;
    }
}