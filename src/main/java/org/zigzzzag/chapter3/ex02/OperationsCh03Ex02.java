package org.zigzzzag.chapter3.ex02;

import org.zigzzzag.model.Artist;

import java.util.List;
import java.util.stream.Stream;

/**
 * <pre>
 * 2. Iteration. Convert this code sample from using external iteration to internal iteration:
 *
 *  int totalMembers = 0;
 *  for (Artist artist : artists) {
 *      Stream<Artist> members = artist.getMembers();
 *      totalMembers += members.count();
 *  }
 * </pre>
 */
class OperationsCh03Ex02 {

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
}
