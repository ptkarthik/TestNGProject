package practise.java8operations.moviedatasorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieData {
    public static void main(String[] args) {
        List<MovieClass> listOfMovies = new ArrayList<>();
        listOfMovies.add(new MovieClass("Alaipayuthey", 8.9, "Romance", 1990));
        listOfMovies.add(new MovieClass("Nayagan", 9.3, "Action", 1988));
        listOfMovies.add(new MovieClass("Devar Magan", 9.4, "Action", 1985));
        listOfMovies.add(new MovieClass("Guna", 8.8, "Drame", 1984));
        listOfMovies.add(new MovieClass("Inception", 8.8, "Sci-Fi", 2010));
        listOfMovies.add(new MovieClass("The Dark Knight", 9.0, "Action", 2008));
        listOfMovies.add(new MovieClass("Forrest Gump", 8.8, "Drama", 1994));
        listOfMovies.add(new MovieClass("The Shawshank Redemption", 9.3, "Drama", 1994));
        listOfMovies.add(new MovieClass("Pulp Fiction", 8.9, "Crime", 1994));
        listOfMovies.add(new MovieClass("The Godfather", 9.2, "Crime", 1972));
        listOfMovies.add(new MovieClass("Gladiator", 8.5, "Action", 2000));
        listOfMovies.add(new MovieClass("The Matrix", 8.7, "Sci-Fi", 1999));
        listOfMovies.add(new MovieClass("Titanic", 7.8, "Romance", 1997));
        listOfMovies.add(new MovieClass("Avatar", 7.8, "Sci-Fi", 2009));
        listOfMovies.add(new MovieClass("Interstellar", 8.6, "Sci-Fi", 2014));
        listOfMovies.add(new MovieClass("The Avengers", 8.0, "Action", 2012));
        listOfMovies.add(new MovieClass("The Lion King", 8.5, "Animation", 1994));
        listOfMovies.add(new MovieClass("12 Angry Men", 9.0, "Drama", 1957));
        listOfMovies.add(new MovieClass("Fight Club", 8.8, "Drama", 1999));
        listOfMovies.add(new MovieClass("The Social Network", 7.7, "Biography", 2010));
        listOfMovies.add(new MovieClass("Shutter Island", 8.2, "Mystery", 2010));
        listOfMovies.add(new MovieClass("A Beautiful Mind", 8.2, "Biography", 2001));
        listOfMovies.add(new MovieClass("Jaws", 8.0, "Thriller", 1975));
        System.out.println("Before Sorting");
        System.out.println("\t");

//        System.out.println(listOfMovies);

        //natural order sorting
        Collections.sort(listOfMovies);
        System.out.println("after Sorting");
        System.out.println("\t");
//        System.out.println(listOfMovies);


        //custom sorting using mvie name
        Collections.sort(listOfMovies, new Comparator<MovieClass>() {
            @Override
            public int compare(MovieClass o1, MovieClass o2) {
                return o2.getMovieName().compareTo(o1.getMovieName());
            }
        });

        //System.out.println(listOfMovies);

        //custom sorting using descending of rating
        Collections.sort(listOfMovies, new Comparator<MovieClass>() {
            @Override
            public int compare(MovieClass o1, MovieClass o2) {
                return Double.compare(o2.getRatings(), o1.getRatings());
            }
        });

        System.out.println(listOfMovies);


        //srting via year
        Collections.sort(listOfMovies, new Comparator<MovieClass>() {
            @Override
            public int compare(MovieClass o1, MovieClass o2) {
                return o2.getYear() - o1.getYear();
            }
        });

        System.out.println(listOfMovies);
    }
}
