package org.zigzzzag.chapter4.multiple_inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestLanguageTest {

    @Test
    public void codeTest() {
        BestLanguage bl = new BestLanguage();
        assertEquals("Java", bl.code());
    }
}