package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    /**
     * Assert distance between points (0,0) and (2,0) should be equal 2.
     */
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    /**
     * Assert distance between points (1,7) and (2,10) should be approximately equal 3.16.
     */
    @Test
    public void when17to210then3dot1428() {
        double expected = 3.16;
        int x1 = 1;
        int y1 = 7;
        int x2 = 2;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    /**
     * Assert distance between points (4,100) and (20,20) should be approximately equal 81.58.
     */
    @Test
    public void when4100to2020then84() {
        double expected = 81.58;
        int x1 = 4;
        int y1 = 100;
        int x2 = 20;
        int y2 = 20;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    /**
     * Assert distance between points (10,-4) and (-10,0) should be approximately equal 20.40.
     */
    @Test
    public void when10minus10toMinus40then10dot8882() {
        double expected = 20.40;
        int x1 = 10;
        int y1 = -4;
        int x2 = -10;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    /**
     * Assert distance between points (Integer.MIN_VALUE/4,Integer.MAX_VALUE/4) and
     * (Integer.MAX_VALUE/4,Integer.MIN_VALUE/4) should be approximately equal 1.51E9.
     */
    @Test
    public void whenIntegerMinValueDivideBy4IntegerMaxValueDivideBy4toIntegerMaxValueDivideBy4IntegerMinValueDivideBy4then10dot8882() {
        double expected = 1.51E9;
        int x1 = Integer.MIN_VALUE / 4;
        int y1 = Integer.MAX_VALUE / 4;
        int x2 = Integer.MAX_VALUE / 4;
        int y2 = Integer.MIN_VALUE / 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01E9);
    }

}