package Model;

/**
 * Created by Livia on 15/01/2016.
 */
public class Movie {

    public Movie(long dbId, String imdbId, String title, String year, String rated, String released
            , String genre, String director, String actors, String plot, String language, String poster, String imdbRating) {
        this.dbId = dbId;
        this.imdbId = imdbId;
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.plot = plot;
        Language = language;
        this.poster = poster;
        this.imdbRating = imdbRating;
    }

    public long dbId;
    public String imdbId;
    public String title;
    public String year;
    public String rated;
    public String released;
    public String genre;
    public String director;
    public String actors;
    public String plot;
    public String Language;
    public String poster;
    public String imdbRating;

}

/*
    Title
Year
Rated
Released
Runtime
Genre
Director
Writer
Actors
Plot
Language
Country
Awards
Poster
Metascore
imdbRating
imdbVotes
imdbID
Type
Response

*/
