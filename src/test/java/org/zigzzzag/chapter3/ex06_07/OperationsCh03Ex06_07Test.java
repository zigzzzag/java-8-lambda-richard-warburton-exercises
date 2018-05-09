package org.zigzzzag.chapter3.ex06_07;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class OperationsCh03Ex06_07Test {

    private final OperationsCh03Ex06_07 operations = new OperationsCh03Ex06_07();


    @Test
    public void lowerCaseCountTest() {
        assertEquals(2, operations.lowerCaseCount("aaAA"));
        assertEquals(7, operations.lowerCaseCount("aa123!@#$%^&*()cndhf"));
    }

    @Test
    public void maxLowerCaseCountTest() {
        List<String> strs = Arrays.asList("aaAA", "bbbBBB", "ASCB");
        assertEquals("bbbBBB", operations.maxLowerCaseCount(strs).orElse(null));

        assertFalse(operations.maxLowerCaseCount(Collections.emptyList()).isPresent());
    }

}