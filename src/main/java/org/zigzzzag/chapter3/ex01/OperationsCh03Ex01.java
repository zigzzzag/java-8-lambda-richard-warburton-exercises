package org.zigzzzag.chapter3.ex01;

import org.zigzzzag.model.Album;
import org.zigzzzag.model.Artist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class OperationsCh03Ex01 {

    int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (x, y) -> x + y);
    }

    List<String> artistInfo(List<Artist> artists) {
        return artists.stream()
                .map(artist -> artist.getName() + " " + artist.getOrigin())
                .collect(Collectors.toList());
    }

    List<Album> mostTracks(List<Album> albums, int countTracks) {
        return albums.stream()
                .filter(album -> album.getTracks().size() > countTracks)
                .collect(Collectors.toList());
    }
}
