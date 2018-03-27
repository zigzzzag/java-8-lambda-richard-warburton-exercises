package org.zigzzzag.chapter2;

import javax.swing.text.DateFormatter;

public class DateFormatterThreadSafe extends DateFormatter {

    private static ThreadLocal<DateFormatter> DATE_FORMATTER_THREAD_LOCAL = ThreadLocal.withInitial(DateFormatter::new);

    public static DateFormatter get() {
        return DATE_FORMATTER_THREAD_LOCAL.get();
    }
}
