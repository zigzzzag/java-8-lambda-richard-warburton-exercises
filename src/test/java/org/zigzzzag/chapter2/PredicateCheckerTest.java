package org.zigzzzag.chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCheckerTest {

    @Test
    public void predicateCheckTest() {
        assertTrue(new PredicateChecker().check(x -> x > 5));
    }
}