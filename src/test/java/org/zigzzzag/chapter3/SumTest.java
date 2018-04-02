package org.zigzzzag.chapter3;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SumTest {

    @Test
    public void addUpTest() {
        Sum sum = new Sum();

        assertEquals(6, sum.addUp(Stream.of(1, 2, 3)));
        assertEquals(0, sum.addUp(Stream.of(1, 2, -3)));
        assertEquals(45, sum.addUp(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }
}