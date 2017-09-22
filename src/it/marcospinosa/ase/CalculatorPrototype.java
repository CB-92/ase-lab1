package it.marcospinosa.ase;

public class CalculatorPrototype implements CalculatorIF {
    @Override
    public int sum(int m, int n) {
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        int count = Math.abs(n);
        boolean isNegative = n<0;
        int sum = m;
        for (int i = 0; i<count; i++){
            if (isNegative) {
                sum -= 1;
            } else {
                sum += 1;
            }
        }
        return sum;
    }

    @Override
    public int subtract(int m, int n) {
        return sum(m, -n);
    }

    @Override
    public int multiply(int m, int n) {
        if (n == 0) {
            return 0;
        }
        int nSign = n<0 ? -1 : 1;
        int mSign = m<0 ? -1 : 1;
        int nn = Math.abs(n);
        int mm = Math.abs(m);
        return nSign * mSign * positiveMultiply(mm, nn);
    }

    @Override
    public int divide(int m, int n) {
        if (n == 0) {
            throw new CalculatorException("You cannot divide by zero!");
        }
        int nSign = n<0 ? -1 : 1;
        int mSign = m<0 ? -1 : 1;
        int nn = Math.abs(n);
        int mm = Math.abs(m);
        return nSign * mSign * positiveDivide(mm, nn);
    }

    private int positiveMultiply(int m, int n){
        int res = 0;
        for (int i=0; i<n; i++){
            res += m;
        }
        return res;
    }

    private int positiveDivide(int m, int n){
        if (n > m) {
            return 0;
        }
        if (n == m) {
            return 1;
        }
        int count = 0;
        boolean stop = false;
        while(m> 0 && !stop) {
            if (m-n >= 0) {
                m -= n;
                count++;
            } else {
                stop = true;
            }
        }
        return count;
    }

    static public class CalculatorException extends RuntimeException {
        public CalculatorException(String message) {
            super(message);
        }
    }
}
