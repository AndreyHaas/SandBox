package com.haas.nsk.andy.utils.dateUtils;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsTest {

    @Test
    public void isLeapYear() {
        DateUtils utils = new DateUtils();
        boolean result = utils.isLeapYear(2020);
        Assert.assertTrue(result);
    }

    @Test
    public void isNotLeapYear() {
        DateUtils utils = new DateUtils();
        boolean result = utils.isLeapYear(2019);
        Assert.assertFalse(result);
    }

    @Test
    public void parseDayTest() throws ParseException {
        DateUtils utils = new DateUtils();
        String day = "04-11-2020";
        Date date = utils.parseDay(day);
        Assert.assertEquals(date, date);
    }
}