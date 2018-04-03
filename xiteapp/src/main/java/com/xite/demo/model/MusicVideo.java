package com.xite.demo.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "MUSIC_VIDEO")
public class MusicVideo {

    @Id
    @Column(name = "ID")
    private Long id;

    @NotNull
    @Column(name = "Title")
    private String title;

    @Column(name = "Album", nullable = true)
    private String album;

    @NotNull
    @Column(name = "Artist")
    private String artist;

    @NotNull
    @Column(name = "Duration")
    private Integer duration;

    @NotNull
    @Range(max = 2018, min = 500)
    @Column(name = "Release_Year")
    private Integer releaseYear;

/*    @ElementCollection
    @CollectionTable(name = "SubgenresHelper", joinColumns = @JoinColumn(name = "ID"))
    private List<SubgenreModel> subgenres = new ArrayList<>();*/

    @Column(name="Subgenres")
    @ElementCollection(targetClass = String.class)
    private List<String> subgenres;

    @NotNull
    @Column(name = "Genre")
    private String genre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public  List<String> getSubgenres() {
        return subgenres;
    }

    public void setSubgenres( List<String> subgenres) {
        this.subgenres = subgenres;
    }
}
