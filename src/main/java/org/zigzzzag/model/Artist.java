package org.zigzzzag.model;

import java.util.Set;

public class Artist {

    /**
     * The name of the artist (e.g., “The Beatles”)
     */
    private String name;

    /**
     * A set of other artists who comprise this group (e.g., “John Lennon”); this field might be empty
     */
    private Set<Artist> members;

    /**
     * The primary location of origin of the group (e.g., “Liverpool”).
     */
    private String origin;


    public Artist(String name, Set<Artist> members, String origin) {
        this.name = name;
        this.members = members;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Artist> getMembers() {
        return members;
    }

    public void setMembers(Set<Artist> members) {
        this.members = members;
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
