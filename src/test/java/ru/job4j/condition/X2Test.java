package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class X2Test {

    /**
     * Test when  a = 10, b = 0, c = 0, x = 2.
     * Expected to be 40.
     */
    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int result = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, result);
    }

    /**
     * Test when  a = 1, b = 1, c = 1, x = 1.
     * Expected to be 3.
     */
    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int result = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, result);
    }

    /**
     * Test when a = 0, b = 1, c = 1, x = 1.
     * Expected to be 2.
     */
    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, result);
    }

    /**
     * Test when a = 1, b = 1, c = 0, x = 1.
     * Expected to be 2.
     */
    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, result);
    }

    /**
     * Test when a = 1, b = 1, c = 1, x = 0.
     * Expected to be 1.
     */
    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int result = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, result);
    }

}