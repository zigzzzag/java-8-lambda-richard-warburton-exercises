package org.zigzzzag.chapter3;

import org.zigzzzag.model.Artist;

import java.util.Iterator;
import java.util.Set;

class InternalCycleCheck {

    private final Set<Artist> allArtists;


    InternalCycleCheck(Set<Artist> allArtists) {
        if (allArtists == null) {
            throw new IllegalArgumentException("Collection of artists must be not null!!!");
        }

        this.allArtists = allArtists;
    }


    long externalCount(String origin) {
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

    long internalCount(String origin) {
        return allArtists.stream()
                .filter(artist -> artist.isFrom(origin))
                .count();
    }
}
