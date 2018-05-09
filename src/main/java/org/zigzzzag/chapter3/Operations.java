package org.zigzzzag.chapter3;

import org.zigzzzag.model.Artist;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class Operations {

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
