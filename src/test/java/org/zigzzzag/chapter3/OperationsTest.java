package org.zigzzzag.chapter3;

import org.junit.Test;
import org.zigzzzag.model.Artist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.zigzzzag.model.Origin.*;

public class OperationsTest {

    private static final List<Artist> MEMBERS_TIM = Arrays.asList(
            new Artist("Sanya", null, NOVOSIBIRSK),
            new Artist("Gogi", null, THAILAND),
            new Artist("Pasha", null, ZIMBABVE)
    );

    private static final List<Artist> MEMBERS_EGOR = Arrays.asList(
            new Artist("Andrey", null, NOVOSIBIRSK),
            new Artist("Marat", null, THAILAND),
            new Artist("Slava", null, ZIMBABVE)
    );

    private static final List<Artist> MEMBERS_MAX = Arrays.asList(
            new Artist("Sancho", null, NOVOSIBIRSK),
            new Artist("Gogi", null, NOVOSIBIRSK),
            new Artist("Shirz", null, NOVOSIBIRSK),
            new Artist("Igor", null, NOVOSIBIRSK),
            new Artist("Serega", null, NOVOSIBIRSK)
    );

    private static final List<Artist> ALL_ARTISTS = Arrays.asList(
            new Artist("Timofei", MEMBERS_TIM, NOVOSIBIRSK),
            new Artist("Egor", MEMBERS_EGOR, THAILAND),
            new Artist("Dima", null, NOVOSIBIRSK),
            new Artist("Sasha", null, NOVOSIBIRSK),
            new Artist("Denis", null, THAILAND),
            new Artist("Maxim", MEMBERS_MAX, NOVOSIBIRSK)
    );

    private final Operations operations = new Operations();

    @Test
    public void externalMembersCount() {
        assertEquals(11, operations.externalMembersCount(ALL_ARTISTS));
    }

    @Test
    public void internalMembersCount() {
        assertEquals(11, operations.internalMembersCount(ALL_ARTISTS));
    }

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