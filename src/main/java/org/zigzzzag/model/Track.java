package org.zigzzzag.model;

import java.util.Objects;

public class Track {

    /**
     * The name of the track (e.g., “Yellow Submarine”)
     */
    private String name;


    public Track(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(name, track.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
