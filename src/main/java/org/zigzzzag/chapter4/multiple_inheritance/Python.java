package org.zigzzzag.chapter4.multiple_inheritance;

public interface Python {

    default String code() {
        return "Python";
    }
}
