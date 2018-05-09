package org.zigzzzag.chapter2;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;

class DateFormatterThreadSafe extends DateFormatter {

    private static final ThreadLocal<DateFormatter> DATE_FORMATTER_THREAD_LOCAL =
            ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd.MM.yyyy")));

    static DateFormatter get() {
        return DATE_FORMATTER_THREAD_LOCAL.get();
    }
}
