package mathutils;

import java.util.Arrays;

public class Median {
    /**
     * Calculates the median of the given array of doubles.
     *
     * @param inputArr Array of double values
     * @return The median of the input Array
     */
    public static double calculate(double[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double[] sorted = Arrays.copyOf(inputArr, inputArr.length);
        Arrays.sort(sorted);

        int length = sorted.length;
        if (length % 2 == 0) {
            return (sorted[length / 2 - 1] + sorted[length / 2]) / 2.0;
        } else {
            return sorted[length / 2];
        }
    }
}
