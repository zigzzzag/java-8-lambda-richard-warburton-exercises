package org.zigzzzag.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Artist {

    /**
     * The name of the artist (e.g., “The Beatles”)
     */
    private String name;

    /**
     * A set of def_method_subclasses artists who comprise this group (e.g., “John Lennon”); this field might be empty
     */
    private final List<Artist> members;

    /**
     * The primary location of origin of the group (e.g., “Liverpool”).
     */
    private String origin;


    public Artist(String name, List<Artist> members, String origin) {
        this.name = name;
        if (members == null) {
            this.members = Collections.emptyList();
        } else {
            this.members = members;
        }
        this.origin = origin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(name, artist.name) &&
                Objects.equals(members, artist.members) &&
                Objects.equals(origin, artist.origin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, members, origin);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artist> getMembers() {
        return members;
    }

    public Stream<Artist> getMembersStream() {
        return members.stream();
    }

    public boolean isFrom(String origin) {
        return origin != null && origin.equals(this.origin);
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
