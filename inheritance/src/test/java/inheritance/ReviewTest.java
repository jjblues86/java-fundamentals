package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    Reviews testReviews;
    @Before
    public void start(){
//        Restaurant restaurant = new Restaurant("Wendys", 3, 5);
        testReviews = new Reviews("This was the best", "Jabin", 5);
    }
    @Test public void testToString(){
        assertEquals("Restaurant: Wendys, Price: 3 \n" + "This was the best", testReviews.toString());
    }
}
