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
    public void whenP10K40Then0dot625() {
        double expected = 0.595;
        double p = 10;
        double k = 40;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}