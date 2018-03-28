package org.zigzzzag.chapter2;

import java.util.function.Predicate;

public class PredicateChecker {

    boolean check(Predicate<Integer> predicate) {
        return predicate.test(10);
    }

// check(x -> x > 5) can not be inferred
//    boolean check(IntPred predicate) {
//        return predicate.test(5);
//    }
}
