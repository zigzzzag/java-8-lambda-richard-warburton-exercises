package org.zigzzzag.chapter3;

import org.junit.Assert;
import org.junit.Test;
import org.zigzzzag.model.Artist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.zigzzzag.model.Origin.NOVOSIBIRSK;
import static org.zigzzzag.model.Origin.THAILAND;

public class InternalCycleCheckTest {

    private static final Set<Artist> ALL_ARTISTS = new HashSet<>(Arrays.asList(
            new Artist("Timofei", null, NOVOSIBIRSK),
            new Artist("Egor", null, THAILAND),
            new Artist("Dima", null, NOVOSIBIRSK),
            new Artist("Sasha", null, NOVOSIBIRSK),
            new Artist("Denis", null, THAILAND),
            new Artist("Maxim", null, NOVOSIBIRSK)
    ));

    private final InternalCycleCheck internalCycleCheck = new InternalCycleCheck(ALL_ARTISTS);

    @Test
    public void externalCountTest() {
        Assert.assertEquals(4, internalCycleCheck.externalCount(NOVOSIBIRSK));
    }

    @Test
    public void internalCountTest() {
        Assert.assertEquals(4, internalCycleCheck.internalCount(NOVOSIBIRSK));
    }
}