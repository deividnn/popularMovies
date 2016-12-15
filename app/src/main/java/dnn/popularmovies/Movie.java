package dnn.popularmovies;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by deivid on 14/12/2016.
 */
public class Movie implements Serializable {

    private int id;
    private String title;
    private String sinopse;
    private Date releaseDate;
    private double voteAverage;
    private String poster;
    private String thumb;

    public Movie() {
    }

    public Movie(int id, String title, String sinopse, Date releaseDate, double voteAverage, String poster, String thumb) {
        this.id = id;
        this.title = title;
        this.sinopse = sinopse;
        this.releaseDate = releaseDate;
        this.voteAverage = voteAverage;
        this.poster = poster;
        this.thumb = thumb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", releaseDate=" + releaseDate +
                ", voteAverage=" + voteAverage +
                ", poster='" + poster + '\'' +
                ", thumb='" + thumb + '\'' +
                '}';
    }
}

