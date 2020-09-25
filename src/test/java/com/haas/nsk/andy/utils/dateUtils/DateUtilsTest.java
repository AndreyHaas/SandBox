package com.haas.nsk.andy.utils.dateUtils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.text.ParseException;
import java.util.Date;

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

    @Test
    public void printDay() throws ParseException {
        Date result = new DateUtils().parseDay("25-09-2020");
        Assert.assertEquals(result, new DateUtils().parseDay("25-09-2020"));
    }
}