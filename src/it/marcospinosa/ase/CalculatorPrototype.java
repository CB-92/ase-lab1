package it.marcospinosa.ase;

public class CalculatorPrototype implements CalculatorIF {
    @Override
    public int sum(int m, int n) {
        int count = n<0 ? -n : n;
        boolean isNegative = n<0;
        int sum = m;
        for (int i = 0; i<count; i++){
            if (isNegative) {
                sum -=1;
            } else {
                sum+=1;
            }
        }
        return sum;
    }

    @Override
    public int divide(int m, int n) {
        if (n > m) {
            return 0;
        }
        if (n == m) {
            return 1;
        }
        int count = 0;
        boolean stop = false;
        while(m > 0 && !stop) {
            if (m-n >= 0){
                m -= n;
                count++;
            } else {
                stop = true;
            }
        }
        return count;
    }
}
