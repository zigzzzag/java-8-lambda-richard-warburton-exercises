package org.zigzzzag.chapter3;

import org.zigzzzag.model.Artist;

import java.util.Iterator;
import java.util.Set;

public class InternanCycleCheck {

    private final Set<Artist> allArtists;


    InternanCycleCheck(Set<Artist> allArtists) {
        if (allArtists == null) {
            throw new IllegalArgumentException("Collection of artists must be not null!!!");
        }

        this.allArtists = allArtists;
    }


    public long externalCount(String origin) {
        long count = 0;
        Iterator<Artist> iterator = allArtists.iterator();
        while (iterator.hasNext()) {
            Artist artist = iterator.next();
            if (artist.isFrom(origin)) {
                count++;
            }
        }

        return count;
    }

    public long internalCount(String origin) {
        return allArtists.stream()
                .filter(artist -> artist.isFrom(origin))
                .count();
    }
}
