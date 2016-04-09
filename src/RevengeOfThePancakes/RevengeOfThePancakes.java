package RevengeOfThePancakes;

public class RevengeOfThePancakes {

    public RevengeOfThePancakes() {
    }

    /**
     * @return If all cakes' flipped side is happy face or not
     */
    private boolean isHappy(String pancakes) {
        return !(pancakes.contains("-"));
    }

    /**
     * Flips the pancakes over.
     *
     * @param start Start index
     * @param end   End index
     */
    private void reverse(String pancakes, int start, int end) {
        for (int i = start; i < end; i++) {
            if (pancakes.charAt(i) == '+') {
                pancakes = pancakes.substring(0, i) + '-' + pancakes.substring(i + 1);
            } else if (pancakes.charAt(i) == '-') {
                pancakes = pancakes.substring(0, i) + '+' + pancakes.substring(i + 1);
            }

        }
    }

    /**
     * @return First opposite index of first char
     */
    private int getOppIndex(String pancakes) {
        int counter = 1;
        char firstChar = pancakes.charAt(0);
        for (int i = 1; i < pancakes.length(); i++) {
            if (pancakes.charAt(i) != firstChar) {
                return counter;
            } else {
                ++counter;
            }
        }
        return counter;
    }

    /**
     * Runs reverse method until all pancakes flipped side
     * becomes happy face.
     *
     * @return Loop count
     */
    public int serve(String pancakes) {
        int i = 0;
        while (!isHappy(pancakes)) {
            reverse(pancakes, 0, getOppIndex(pancakes));
            i++;
        }
        return i;
    }
}
