package org.zigzzzag.chapter3;

import org.junit.Assert;
import org.junit.Test;
import org.zigzzzag.model.Artist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InternanCycleCheckTest {

    private static final Set<Artist> ALL_ARTISTS = new HashSet<>(Arrays.asList(
            new Artist("Timofei", null, "Novosibirsk"),
            new Artist("Egor", null, "Thailand"),
            new Artist("Dima", null, "Novosibirsk"),
            new Artist("Sasha", null, "Novosibirsk"),
            new Artist("Denis", null, "Thailand"),
            new Artist("Maxim", null, "Novosibirsk")
    ));

    private final InternanCycleCheck internanCycleCheck = new InternanCycleCheck(ALL_ARTISTS);

    @Test
    public void externalCountTest() {
        Assert.assertEquals(4, internanCycleCheck.externalCount("Novosibirsk"));
    }

    @Test
    public void internalCountTest() {
        Assert.assertEquals(4, internanCycleCheck.internalCount("Novosibirsk"));
    }
}