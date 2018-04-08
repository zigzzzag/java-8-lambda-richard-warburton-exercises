package org.zigzzzag.chapter3;

import org.zigzzzag.model.Album;
import org.zigzzzag.model.Artist;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Operations {

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

    int externalMembersCount(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembersStream();
            totalMembers += members.count();
        }
        return totalMembers;
    }

    int internalMembersCount(List<Artist> artists) {
        return (int) artists.stream()
                .flatMap(Artist::getMembersStream)
                .count();
    }

    long lowerCaseCount(String str) {
        return str.chars().filter(Character::isLowerCase).count();
    }

    Optional<String> maxLowerCaseCount(List<String> strs) {
        return strs.stream().max((s1, s2) -> (int) (lowerCaseCount(s1) - lowerCaseCount(s2)));
    }
}
