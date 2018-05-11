package org.zigzzzag.chapter4.multiple_inheritance;

public class BestLanguage implements Java, Python {

    /**
     * <pre>
     * Without overriding compile error:
     * class BestLanguage inherits unrelated defaults for code() from types Java and Python
     * </pre>
     *
     * @return Best language
     */
    @Override
    public String code() {
        return Java.super.code();
    }
}
