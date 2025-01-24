package practise.practiseroundtwo.java8;

import java.util.Objects;

public class MovieClass implements Comparable<MovieClass> {
    private String movieName;
    private double ratings;
    private String genre;

    @Override
    public String toString() {
        return "MovieClass{" +
                "movieName='" + movieName + '\'' +
                ", ratings=" + ratings +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }

    private int year;

    @Override
    public int hashCode() {
        return Objects.hash(movieName, ratings, genre, year);
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public MovieClass(String movieName, double ratings, String genre, int year) {
        this.movieName = movieName;
        this.ratings = ratings;
        this.genre = genre;
        this.year = year;
    }


    @Override
    public int compareTo(MovieClass o) {
        return this.getMovieName().compareTo(o.getMovieName());
    }
}
