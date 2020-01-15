package inheritance;

import java.util.LinkedList;

public class Theater extends Store {
    public String name;
    LinkedList<String> movies;

    public Theater(String name, int stars) {
        super(name,stars,priceCategory);
        this.name = name;
        this.movies = new LinkedList<>();
    }

    public void addMovie(String movie){
        movies.add(movie);
    }

    public void removeMovie(String movie){
        movies.remove(movie);
    }

    public LinkedList<String> getMovies(){
        return movies;
    }

    public String toString(){
        return String.format("Theater: %s \n Stars: %d", this.name, this.stars);
    }
}
