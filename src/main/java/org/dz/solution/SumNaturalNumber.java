package org.dz.solution;

public class SumNaturalNumber {
    public int getSumNaturalNumbersFrom1ToN(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number can't be negative");
        }
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = i + sum;
        }
        return sum;
    }
}
