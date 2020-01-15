package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TheaterTest {
    Theater testTheater;
    @Before
    public void start(){
        testTheater = new Theater("AMC", 4);
    }
    @Test public void testToString(){
        assertEquals("This should return the Theater name and star rating", "Theater: AMC \n Stars: 4", testTheater.toString());
    }
    @Test public void testAddReviews(){
        Reviews testReview = new Reviews("Regal", "Jet Li", 4);
        assertEquals("This should review the Theater", 4, testTheater.stars);
        System.out.println("testReview = " + testReview);
    }
    @Test public void testAddMovie(){
        testTheater.addMovie("Adding movie");
        assertEquals("Add a movie", "[Adding movie]", testTheater.getMovies().toString());
    }
    @Test public void testRemoveMovie(){
        testTheater.removeMovie("Adding movie");
        assertFalse("This remove a movie", testTheater.movies.contains("Adding movie"));
    }
}
