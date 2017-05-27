package testing;

/**
 * Created by TuanLQ on 5/27/17.
 */
public class Calculator {
    /**
     * Method used to find max between two number.
     * @param a
     * @param b
     * @return max is a or b or zero if equal value.
     */
    public int max(int a, int b) {
        if (a == b) {
            return 0;
        }

        return a > b ? a : b;
    }
}
