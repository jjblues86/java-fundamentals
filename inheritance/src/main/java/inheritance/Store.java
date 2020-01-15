package inheritance;

import java.util.LinkedList;

public class Store implements Reviewer {

    LinkedList<Reviews> restaurantsReviews = new LinkedList<>();
    public String name;
    public int stars;
    public static int priceCategory;

    public Store(String name, int stars, int priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    @Override
    public void addReview(Reviews review) {
        restaurantsReviews.add(review);

        double starCounter = 0;
        double average;

        for(Reviews reviews: restaurantsReviews){
            starCounter += reviews.numberOfStars;
        }

        average = starCounter / restaurantsReviews.size();
        this.stars = (int) average;
    }
}
