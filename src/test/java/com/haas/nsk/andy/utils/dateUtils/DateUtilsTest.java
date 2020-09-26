package com.haas.nsk.andy.utils.dateUtils;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {

    DateUtils utils = new DateUtils();

    @Test
    public void isLeapYear() {
        boolean result = utils.isLeapYear(2020);
        Assert.assertTrue(result);
    }

    @Test
    public void isNotLeapYear() {
        boolean result = utils.isLeapYear(2019);
        Assert.assertFalse(result);
    }
}