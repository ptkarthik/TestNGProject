package practise.practiseroundtwo.java8;

import practise.java8operations.moviedatasorting.MovieClass;

import java.util.ArrayList;
import java.util.List;

public class SortCustomObjects {
    public static void main(String[] args) {
        List<practise.java8operations.moviedatasorting.MovieClass> listOfMovies = new ArrayList<>();
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Alaipayuthey", 8.9, "Romance", 1990));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Nayagan", 9.3, "Action", 1988));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Devar Magan", 9.4, "Action", 1985));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Guna", 8.8, "Drame", 1984));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Inception", 8.8, "Sci-Fi", 2010));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("The Dark Knight", 9.0, "Action", 2008));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Forrest Gump", 8.8, "Drama", 1994));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("The Shawshank Redemption", 9.3, "Drama", 1994));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Pulp Fiction", 8.9, "Crime", 1994));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("The Godfather", 9.2, "Crime", 1972));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Gladiator", 8.5, "Action", 2000));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("The Matrix", 8.7, "Sci-Fi", 1999));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Titanic", 7.8, "Romance", 1997));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Avatar", 7.8, "Sci-Fi", 2009));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Interstellar", 8.6, "Sci-Fi", 2014));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("The Avengers", 8.0, "Action", 2012));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("The Lion King", 8.5, "Animation", 1994));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("12 Angry Men", 9.0, "Drama", 1957));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Fight Club", 8.8, "Drama", 1999));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("The Social Network", 7.7, "Biography", 2010));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("Shutter Island", 8.2, "Mystery", 2010));
        listOfMovies.add(new practise.java8operations.moviedatasorting.MovieClass("A Beautiful Mind", 8.2, "Biography", 2001));
        listOfMovies.add(new MovieClass("Jaws", 8.0, "Thriller", 1975));
    }
}
