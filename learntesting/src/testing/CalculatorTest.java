package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by TuanLQ on 5/27/17.
 */
class CalculatorTest {

    protected int value1 = 100, value2 = 1001;

    @Test
    protected void setup() {
        value1 = 4;
        value2 = 5;

    }

    @Test
    void max() {
        Calculator calculator = new Calculator();

        assertEquals(value2, calculator.max(value1, value2));

        assertEquals(100, Math.abs(100));
    }

}