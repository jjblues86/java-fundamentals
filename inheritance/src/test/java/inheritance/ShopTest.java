package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    Shop testShop;
    @Before
    public void start(){
        testShop = new Shop("kaynBee", "An event planning shop", 7, 4);
    }
    @Test public void testToString(){
        assertEquals("This should print out a string about the shop", "Shop: kaynBee\nPrice: 7\nStars: 4\nDescription: An event planning shop", testShop.toString());
    }
    @Test public void testAddReview(){
        Reviews testReview = new Reviews("Great shop", "Kay", 5);
        assertEquals("This should reveiw a shop", 4, testShop.stars);
    }
}
