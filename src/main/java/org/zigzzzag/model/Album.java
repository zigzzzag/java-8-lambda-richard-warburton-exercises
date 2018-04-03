package org.zigzzzag.model;

import java.util.List;
import java.util.Objects;

public class Album {

    /**
     * The name of the album (e.g., “Revolver”)
     */
    private String name;

    /**
     * A list of tracks
     */
    private List<Track> tracks;

    /**
     * A list of artists who helped create the music on this album
     */
    private List<Artist> musicians;


    public Album(String name, List<Track> tracks, List<Artist> musicians) {
        this.name = name;
        this.tracks = tracks;
        this.musicians = musicians;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(name, album.name) &&
                Objects.equals(tracks, album.tracks) &&
                Objects.equals(musicians, album.musicians);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, tracks, musicians);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Artist> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Artist> musicians) {
        this.musicians = musicians;
    }
}
