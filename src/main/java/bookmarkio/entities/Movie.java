package bookmarkio.entities;

public class Movie extends Bookmark {

    private int releaseYear;
    private String[] directors;
    private String[] cast;
    private String genre;
    private double imdbRating;

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String[] getDirectors() {
        return directors;
    }

    public void setDirectors(String[] directors) {
        this.directors = directors;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString() {
        return "Movie{" + "releaseYear=" + releaseYear + ", directors=" + directors + ", cast=" + cast + ", genre=" + genre + ", imdbRating=" + imdbRating + '}';
    }

}
