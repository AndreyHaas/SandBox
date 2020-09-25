package com.haas.nsk.andy.utils.dateUtils;

import java.util.GregorianCalendar;

public class DateUtils {
    public boolean isLeapYear(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }
}
