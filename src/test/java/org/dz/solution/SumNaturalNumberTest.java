package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumNaturalNumberTest {

    @Test
    public void getSumNaturalNumbersFrom1ToNFor05() {
        SumNaturalNumber calculator = new SumNaturalNumber();
        int result = calculator.getSumNaturalNumbersFrom1ToN(5);
        Assert.assertEquals(15, result);
    }

    @Test
    public void getSumNaturalNumbersFrom1ToNFor10() {
        SumNaturalNumber calculator = new SumNaturalNumber();
        int result = calculator.getSumNaturalNumbersFrom1ToN(10);
        Assert.assertEquals(55, result);
    }

    @Test
    public void getSumNaturalNumbersFrom1ToNFor03() {
        SumNaturalNumber calculator = new SumNaturalNumber();
        int result = calculator.getSumNaturalNumbersFrom1ToN(3);
        Assert.assertEquals(6, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSumNaturalNumbersFrom1ToNFor0() {
        SumNaturalNumber calculator = new SumNaturalNumber();
        calculator.getSumNaturalNumbersFrom1ToN(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSumNaturalNumbersFrom1ToNForMinus3() {
        SumNaturalNumber calculator = new SumNaturalNumber();
        calculator.getSumNaturalNumbersFrom1ToN(-3);
    }


}