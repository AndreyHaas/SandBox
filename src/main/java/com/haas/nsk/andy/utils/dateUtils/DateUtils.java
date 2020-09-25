package com.haas.nsk.andy.utils.dateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateUtils {
    public boolean isLeapYear(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }

    public Date parseDay(String day) throws ParseException {
        return new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(day);
    }
}