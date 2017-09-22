package it.marcospinosa.ase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculatorTestPrototype {
    private static final int RANDOM_TEST_OPERATION = 800;
    private static final int RANDOM_TEST_MAX_ABS_VALUE = 100;

    ///////////////////////////////////////////////////////
    // TEST SUM
    ///////////////////////////////////////////////////////
    @Test
    public void testSumBothPositive() {
        System.out.println("\nTesting sum function (Both positive)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth positive [ 3 + 3 = 6 ]... ");
        int sum = calculator.sum(3,3);
        assertEquals(6, sum);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testSumBothNegative() {
        System.out.println("\nTesting sum function (Both negative)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth negative [ -3 + (-3) = -6 ]... ");
        int sum = calculator.sum(-3,-3);
        assertEquals(-6, sum);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testSumPositiveNegative() {
        System.out.println("\nTesting sum function (positive - negative)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tpositive-negative -> positive [ 7 + (-3) = 4 ]... ");
        int sum = calculator.sum(7,-3);
        assertEquals(4, sum);
        System.out.println("ok");

        System.out.print("\tpositive-negative -> negative [ 3 + (-7) = -4 ]... ");
        sum = calculator.sum(3,-7);
        assertEquals(-4, sum);
        System.out.println("ok");

        System.out.print("\tpositive-negative -> zero [ 3 + (-3) = 0 ]... ");
        sum = calculator.sum(3,-3);
        assertEquals(0, sum);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testSumNegativePositive() {
        System.out.println("\nTesting sum function (negative-positive)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tnegative-positive -> positive [ -30 + 70 = 40 ]... ");
        int sum = calculator.sum(-30,70);
        assertEquals(40, sum);
        System.out.println("ok");

        System.out.print("\tnegative-positive -> negative [ -30 + 10 = -20 ]... ");
        sum = calculator.sum(-30,10);
        assertEquals(-20, sum);
        System.out.println("ok");

        System.out.print("\tnegative-positive -> zero [ -65 + 65 = 0 ]... ");
        sum = calculator.sum(-65,65);
        assertEquals(0, sum);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testSumZero() {
        System.out.println("\nTesting sum function (Zero)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth zero [ 0 + 0 = 0 ]... ");
        int sum = calculator.sum(0,0);
        assertEquals(0, sum);
        System.out.println("ok");

        System.out.print("\t(m = 0) -> positive [ 0 + 3 = 3 ]... ");
        sum = calculator.sum(0,3);
        assertEquals(3, sum);
        System.out.println("ok");

        System.out.print("\t(m = 0) -> negative [ 0 + (-3) = -3 ]... ");
        sum = calculator.sum(0,-3);
        assertEquals(-3, sum);
        System.out.println("ok");

        System.out.print("\t(n = 0) -> positive [ 5 + 0 = 5 ]... ");
        sum = calculator.sum(5,0);
        assertEquals(5, sum);
        System.out.println("ok");

        System.out.print("\t(n = 0) -> negative [ (-9) + 0 = -9 ]... ");
        sum = calculator.sum(-9,0);
        assertEquals(-9, sum);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    ///////////////////////////////////////////////////////
    // TEST SUBTRACT
    ///////////////////////////////////////////////////////
    @Test
    public void testSubtractBothPositive() {
        System.out.println("\nTesting subtract function (Both positive)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth positive -> positive [ 6 - 3 = 3 ]... ");
        int sub = calculator.subtract(6,3);
        assertEquals(3, sub);
        System.out.println("ok");

        System.out.print("\tBoth positive -> negative [ 6 - 9 = -3 ]... ");
        sub = calculator.subtract(6,9);
        assertEquals(-3, sub);
        System.out.println("ok");

        System.out.print("\tBoth positive -> zero [ 6 - 6 = 0 ]... ");
        sub = calculator.subtract(6,6);
        assertEquals(0, sub);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testSubtractBothNegative() {
        System.out.println("\nTesting subtract function (Both negative)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth negative -> positive [ -3 - (-7) = 4 ]... ");
        int sub = calculator.subtract(-3,-7);
        assertEquals(4, sub);
        System.out.println("ok");

        System.out.print("\tBoth negative -> negative [ -3 - (-1) = -2 ]... ");
        sub = calculator.subtract(-3,-1);
        assertEquals(-2, sub);
        System.out.println("ok");

        System.out.print("\tBoth negative -> zero [ -8 - (-8) = 0 ]... ");
        sub = calculator.subtract(-8,-8);
        assertEquals(0, sub);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testSubtractPositiveNegative() {
        System.out.println("\nTesting subtract function (positive-negative)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tpositive-negative [ 7 - (-3) = 10 ]... ");
        int sub = calculator.subtract(7,-3);
        assertEquals(10, sub);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testSubtractNegativePositive() {
        System.out.println("\nTesting subtract function (negative-positive)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tnegative-positive [ -30 - 70 = -100 ]...");
        int sub = calculator.subtract(-30,70);
        assertEquals(-100, sub);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testSubtractZero() {
        System.out.println("\nTesting subtract function (Zero)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth zero [ 0 - 0 = 0 ]... ");
        int sub = calculator.subtract(0,0);
        assertEquals(0, sub);
        System.out.println("ok");

        System.out.print("\t(m = 0) -> positive [ 0 - (-3) = 3 ]... ");
        sub = calculator.subtract(0,-3);
        assertEquals(3, sub);
        System.out.println("ok");

        System.out.print("\t(m = 0) -> negative [ 0 - 3 = -3 ]... ");
        sub = calculator.subtract(0,3);
        assertEquals(-3, sub);
        System.out.println("ok");

        System.out.print("\t(n = 0) -> positive [ 3 - 0 = 3 ]... ");
        sub = calculator.subtract(3,0);
        assertEquals(3, sub);
        System.out.println("ok");

        System.out.print("\t(n = 0) -> negative [ (-7) - 0 = -7 ]... ");
        sub = calculator.subtract(-7,0);
        assertEquals(-7, sub);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    ///////////////////////////////////////////////////////
    // TEST MULTIPLY
    ///////////////////////////////////////////////////////
    @Test
    public void testMultiplyBothPositive() {
        System.out.println("\nTesting multiply function (Both positive)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth positive [ 3 * 3 = 9 ]... ");
        int mul = calculator.multiply(3,3);
        assertEquals(9, mul);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testMultiplyBothNegative() {
        System.out.println("\nTesting multiply function (Both negative)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth negative [ -3 * (-3) = 9 ]... ");
        int mul = calculator.multiply(-3,-3);
        assertEquals(9, mul);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testMultiplyPositiveNegative() {
        System.out.println("\nTesting multiply function (positive - negative)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tpositive-negative [ 7 * (-3) = -21 ]... ");
        int mul = calculator.multiply(7,-3);
        assertEquals(-21, mul);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testMultiplyNegativePositive() {
        System.out.println("\nTesting multiply function (negative - positive)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tnegative-positive [ -30 * 7 = -210 ]... ");
        int mul = calculator.multiply(-30,7);
        assertEquals(-210, mul);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testMultiplyZero() {
        System.out.println("\nTesting multiply function (Zero)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth zero [ 0 * 0 = 0 ]... ");
        int mul = calculator.multiply(0,0);
        assertEquals(0, mul);
        System.out.println("ok");

        System.out.print("\tm=0 [ 0 * 3 = 0 ]... ");
        mul = calculator.multiply(0,3);
        assertEquals(0, mul);
        System.out.println("ok");

        System.out.print("\tn=0 [ 2 * 0 = 0 ]... ");
        mul = calculator.multiply(2,0);
        assertEquals(0, mul);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    ///////////////////////////////////////////////////////
    // TEST DIVISION
    ///////////////////////////////////////////////////////
    @Test
    public void testDivisionBothPositive() {
        System.out.println("\nTesting divide function (Both Positive)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth positive (n|m) [ 6 / 3 = 2 ]... ");
        int div = calculator.divide(6,3);
        assertEquals(2, div);
        System.out.println("ok");

        System.out.print("\tBoth positive (n not| m) [ 6 / 4 = 1 ]... ");
        div = calculator.divide(6,4);
        assertEquals(1, div);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testDivisionBothNegative() {
        System.out.println("\nTesting divide function (Both Negative)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth negative (n|m) [ -15 / (-3) = 5 ]... ");
        int div = calculator.divide(-15,-3);
        assertEquals(5, div);
        System.out.println("ok");

        System.out.print("\tBoth negative (n not| m) [ -15 / (-6) = 2 ]... ");
        div = calculator.divide(-15,-6);
        assertEquals(2, div);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testDivisionPositiveNegative() {
        System.out.println("\nTesting divide function (Positive - Negative)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tpositive-negative (n|m) [ 8 / (-2) = -4 ]... ");
        int div = calculator.divide(8,-2);
        assertEquals(-4, div);
        System.out.println("ok");

        System.out.print("\tpositive-negative (n not| m) [ 7 / (-2) = -3 ]... ");
        div = calculator.divide(7,-2);
        assertEquals(-3, div);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testDivisionNegativePositive() {
        System.out.println("\nTesting divide function (Negative - Positive)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tnegative-positive (n|m) [ -30 / 5 = -6 ]... ");
        int div = calculator.divide(-30,5);
        assertEquals(-6, div);
        System.out.println("ok");

        System.out.print("\tnegative-positive (n not| m) [ -30 / 7 = -4 ]... ");
        div = calculator.divide(-30,7);
        assertEquals(-4, div);
        System.out.println("ok");

        System.out.println("Test completed");
    }

    @Test
    public void testDivisionZero() {
        System.out.println("\nTesting divide function (Zero)...");
        CalculatorPrototype calculator = new CalculatorPrototype();

        System.out.print("\tBoth zero [ 0 / 0 = 0 ]... ");
        try {
            calculator.divide(0,0);
            fail("It should throw an exception! (division by 0)");
        } catch (CalculatorPrototype.CalculatorException e){
            System.out.println("ok");
        }
        System.out.print("\t(m = 0) [ 0 / 3 = 0 ]... ");
        int div = calculator.divide(0,3);
        assertEquals(0, div);
        System.out.println("ok");

        System.out.print("\t(n = 0) [ 2 / 0 = 0 ]...");
        try {
            calculator.divide(2,0);
            fail("It should throw an exception! (division by 0)");
        } catch (CalculatorPrototype.CalculatorException e){
            System.out.println("ok");
        }

        System.out.println("Test completed");
    }

    ///////////////////////////////////////////////////////
    // RANDOM TEST
    ///////////////////////////////////////////////////////

    @Test
    public void randomTest() {
        System.out.println("\nTesting Calculator functions randomly...");
        CalculatorPrototype calculator = new CalculatorPrototype();
        int res;
        for (int i=0; i<RANDOM_TEST_OPERATION; i++ ) {
            int mSign = Math.random() < 0.5 ? -1 : 1;
            int nSign = Math.random() < 0.5 ? -1 : 1;
            int m = mSign * (int) Math.round(Math.random() * RANDOM_TEST_MAX_ABS_VALUE); //[0-100]
            int n = nSign * (int) Math.round(Math.random() * RANDOM_TEST_MAX_ABS_VALUE); //[0-100]
            switch (i%4) {
                case 0:
                    System.out.printf("\tSum [ %d + %d = %d ]... ", m, n, m+n);
                    res = calculator.sum(m,n);
                    assertEquals(m+n, res);
                    System.out.println("ok");
                    break;
                case 1:
                    System.out.printf("\tSubtract [ %d - %d = %d ]... ", m, n, m-n);
                    res = calculator.subtract(m,n);
                    assertEquals(m-n, res);
                    System.out.println("ok");
                    break;
                case 2:
                    System.out.printf("\tMultiply [ %d * %d = %d ]... ", m, n, m*n);
                    res = calculator.multiply(m,n);
                    assertEquals(m*n, res);
                    System.out.println("ok");
                    break;
                case 3:
                    if (n == 0){
                        try {
                            System.out.printf("\tDivide [ %d / %d = Exception ]... ", m, n);
                            calculator.divide(m,n);
                            fail("It should throw an exception! (division by 0)");
                        } catch (CalculatorPrototype.CalculatorException e){
                            System.out.println("ok");
                        }
                    } else {
                        System.out.printf("\tDivide [ %d / %d = %d ]... ", m, n, m/n);
                        res = calculator.divide(m,n);
                        assertEquals(m/n, res);
                        System.out.println("ok");
                    }
                    break;
            }
        }
        System.out.println("Test completed");
    }
}
