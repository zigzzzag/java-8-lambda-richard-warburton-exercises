package org.zigzzzag.chapter2;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

public class DateFormatterThreadSafeTest {

    private static final long TIME_27_03_2018 = 1522159494039L;

    @Test
    public void dateFormatterThreadSafeTest() throws ParseException {
        Assert.assertEquals("27.03.2018", DateFormatterThreadSafe.get().valueToString(new Date(TIME_27_03_2018)));
    }

}