package org.zigzzzag.chapter3.ex01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.zigzzzag.model.Album;
import org.zigzzzag.model.Artist;
import org.zigzzzag.model.Track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.zigzzzag.model.Origin.*;

public class OperationsCh03Ex01Test {

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

    private final OperationsCh03Ex01 operations = new OperationsCh03Ex01();
    private final List<Album> albums = new ArrayList<>();

    @Before
    public void init() {
        List<Track> tracks1 = Arrays.asList(
                new Track("Album 1 Track 1"),
                new Track("Album 1 Track 2"),
                new Track("Album 1 Track 3"),
                new Track("Album 1 Track 4")
        );
        albums.add(new Album("Album 1", tracks1, ALL_ARTISTS));

        List<Track> tracks2 = Arrays.asList(
                new Track("Album 2 Track 1"),
                new Track("Album 2 Track 2"),
                new Track("Album 2 Track 3"),
                new Track("Album 2 Track 4"),
                new Track("Album 2 Track 5")
        );
        albums.add(new Album("Album 2", tracks2, ALL_ARTISTS));

        List<Track> tracks3 = Collections.singletonList(
                new Track("Album 3 Track 1")
        );
        albums.add(new Album("Album 3", tracks3, ALL_ARTISTS));

        List<Track> tracks4 = Arrays.asList(
                new Track("Album 4 Track 1"),
                new Track("Album 4 Track 2")
        );
        albums.add(new Album("Album 4", tracks4, ALL_ARTISTS));

        List<Track> tracks5 = Arrays.asList(
                new Track("Album 5 Track 1"),
                new Track("Album 5 Track 2"),
                new Track("Album 5 Track 3")
        );
        albums.add(new Album("Album 5", tracks5, ALL_ARTISTS));
    }

    @Test
    public void addUpTest() {
        assertEquals(6, operations.addUp(Stream.of(1, 2, 3)));
        assertEquals(0, operations.addUp(Stream.of(1, 2, -3)));
        assertEquals(45, operations.addUp(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }

    @Test
    public void artistInfoTest() {
        List<String> expeted = Arrays.asList(
                "Timofei Novosibirsk",
                "Egor Thailand",
                "Dima Novosibirsk",
                "Sasha Novosibirsk",
                "Denis Thailand",
                "Maxim Novosibirsk"
        );
        Assert.assertEquals(expeted, operations.artistInfo(ALL_ARTISTS));
    }

    @Test
    public void mostAlbums() {
        List<Album> expected = new ArrayList<>();

        List<Track> tracks1 = Arrays.asList(
                new Track("Album 1 Track 1"),
                new Track("Album 1 Track 2"),
                new Track("Album 1 Track 3"),
                new Track("Album 1 Track 4")
        );
        expected.add(new Album("Album 1", tracks1, ALL_ARTISTS));

        List<Track> tracks2 = Arrays.asList(
                new Track("Album 2 Track 1"),
                new Track("Album 2 Track 2"),
                new Track("Album 2 Track 3"),
                new Track("Album 2 Track 4"),
                new Track("Album 2 Track 5")
        );
        expected.add(new Album("Album 2", tracks2, ALL_ARTISTS));

        assertEquals(expected, operations.mostTracks(albums, 3));
    }
}