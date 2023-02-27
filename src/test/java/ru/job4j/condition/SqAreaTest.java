package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K4Then0dot04() {
        double expected = 0.04;
        double p = 1;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP0K0Then0() {
        double expected = 0;
        double p = 0;
        double k = 0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}