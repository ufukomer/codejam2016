package CountingSheep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

    private Set<Integer> digits;

    public CountingSheep() {
        digits = new HashSet<>();
        digits.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    /**
     * Calculates digit length.
     *
     * @param number Number
     * @return Digit length
     */
    private int getDigitLength(int number) {
        String sNumber = String.valueOf(number);
        return sNumber.length();
    }

    /**
     * Gets the all digits of the number to compare
     * with global digits variable.
     *
     * @return Set of digits of number
     */
    private Set<Integer> getDigits(int number) {
        Set<Integer> digitSet = new HashSet<>();
        int length = getDigitLength(number);

        for (int i = 0; i < length; i++) {
            digitSet.add(number % 10);
            number = number / 10;
        }

        return digitSet;
    }

    /**
     * Calculates the number of loops until having a
     * set that contains the all digits from 1 to 9.
     *
     * @param N Number to start counting from
     * @return Number of loops until sleeping
     */
    public int sleep(int N) {
        if (N == 0) {
            return 0;
        }

        int i = 1, result = 0;
        boolean isSleep = false;
        Set<Integer> digitSet = new HashSet<>();

        while (!isSleep) {
            result = i++ * N;
            digitSet.addAll(getDigits(result));
            if (digitSet.containsAll(digits)) {
                isSleep = true;
            }
        }

        return result;
    }
}
