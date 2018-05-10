package org.zigzzzag.chapter4.other;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OverridingChildTest {

    @Test
    public void welcomeTest() {
        Parent p = new OverridingChild();
        assertEquals("ParentImpl welcome", p.welcome());
    }
}